package com.github.teruteru128.study;

import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.SignedObject;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.time.Instant;
import java.util.Base64;
import java.util.HexFormat;
import java.util.UUID;
import java.util.function.Function;
import java.util.random.RandomGenerator;
import picocli.CommandLine.Command;

public class SerializeSample {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 2 || !args[0].equalsIgnoreCase("--in")) {
            out();
        } else {
            in(args[1]);
        }
    }

    static void out() throws IOException {
        var encoder = Base64.getEncoder();
        try (var oos = new ObjectOutputStream(new BufferedOutputStream(encoder.wrap(System.out)))) {
            oos.writeObject(new UniqueIdentity(RandomGenerator.of("SecureRandom").nextLong(), UUID.randomUUID(), Instant.now()));
        }
    }

    static void in(String name) throws IOException, ClassNotFoundException {
        var in = System.getenv(name);
        if (in == null || in.isEmpty()) {
            return;
        }
        var decoder = Base64.getDecoder();
        try (var ois = new ObjectInputStream(
                new BufferedInputStream(decoder.wrap(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8)))))) {
            var obj = ois.readObject();
            if (obj instanceof UniqueIdentity uniqueIdentity) {
                System.out.printf("%d, %s, %s%n", uniqueIdentity.seed(), uniqueIdentity.uuid(), uniqueIdentity.time());
            }
        }
    }

    /**
     * ラムダ式を署名＆暗号化してシリアライズして見るサンプル
     * @see <a href="https://www.ne.jp/asahi/hishidama/home/tech/java/lambda.html#h_serialize">Javaラムダ式#シリアライズ</a>
     * @throws NoSuchAlgorithmException a
     * @throws InvalidParameterSpecException a
     * @throws InvalidKeySpecException a
     * @throws IOException a
     * @throws InvalidKeyException a
     * @throws SignatureException a
     */
    @Command(name = "sign")
    static void signSample()
        throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeySpecException, IOException, InvalidKeyException, SignatureException {
      // 処理をシリアライズするなら普通にクラスをシリアライズしろってなｗ
      // こんな面倒な処理やるんじゃなくてTLS接続上で普通にObjectInputStream使ったほうがいいやろ
      AlgorithmParameters parameters = AlgorithmParameters.getInstance("EC");
      parameters.init(new ECGenParameterSpec("secp256k1"));
      var params = parameters.getParameterSpec(ECParameterSpec.class);
      var factory = KeyFactory.getInstance("ECDSA");

      var hexFormat = HexFormat.of();
      var sign = Signature.getInstance("ECDSA");
      var signObject = new SignedObject(
          (Function<String, String> & Serializable) i -> i.repeat(3) + "って？",
          factory.generatePrivate(new ECPrivateKeySpec(new BigInteger(1,
              hexFormat.parseHex("2071778BC323CE82095CB4D26C8B62F94DB4748CE5A9F61C6D2DDFFADE2BB446")),
              params)), sign);
      if (signObject.verify(factory.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1,
              hexFormat.parseHex("F166D9114137A496AE1BEDE6B6CA6EAB19B84D34984897183B7426650C33ED8A")),
              new BigInteger(1,
                  hexFormat.parseHex(
                      "A8E145E1A671C4C4D40EDA5CF858273798E5746EB277A568C1B710ABB440E46F"))), params)),
          sign)) {
        System.out.println("check ok");
      } else {
        System.out.println("check ng");
      }
    }
}
