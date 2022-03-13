package com.twitter.teruteru128.study;

import java.nio.file.Path;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.twitter.teruteru128.study.bitmessage.DeterministicAddressesCalcurator;
import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddress;
import com.twitter.teruteru128.study.image.ImageLoadTest;
import com.twitter.teruteru128.study.sf.Shangri_laFrontierCountDown;
import com.twitter.teruteru128.study.swing.SwingStudy;
import com.twitter.teruteru128.study.utf8.UTF8DecodeSample;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        /* 
        var service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(6);
        //service.scheduleAtFixedRate(new DeepWebRadioPoller(), 0, 73, TimeUnit.MINUTES);
        // https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/concurrent/ScheduledExecutorService.html
        var future=service.schedule(new ImageLoadTest(), 0, TimeUnit.NANOSECONDS);
        // service.schedule(new Shangri_laFrontierCountDown(), 0, TimeUnit.NANOSECONDS);
        //service.schedule(new ServiceCallSample(), 0, TimeUnit.NANOSECONDS);
        //var study = args.length >= 1 ? new SwingStudy(Path.of(args[0])) : new SwingStudy();
        //service.schedule(study, 0, TimeUnit.NANOSECONDS);
        //service.schedule(new NativePRNGSample(), 0, TimeUnit.NANOSECONDS);
        //service.schedule(new UTF8DecodeSample(), 0, TimeUnit.NANOSECONDS);
        service.schedule((Callable<Void>)()->{
            var random = SecureRandom.getInstanceStrong();
            System.out.printf("#%06x%n", random.nextInt(0x1000000));
            return null;
        }, 0, TimeUnit.NANOSECONDS);
        service.schedule(() -> {
            System.out.println("シャットダウンします……");
            service.shutdown();
        }, 5, TimeUnit.SECONDS);
        var p = future.get();
        System.out.println(p); */
        // http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/tor/#9
        var calcurator = new DeterministicAddressesCalcurator();
        var passphrase = "jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd";
        var ripe = calcurator.apply(passphrase);
        var address3 = BMAddress.encodeAddress(3, 1, ripe);
        var address4 = BMAddress.encodeAddress(4, 1, ripe);
        System.out.println(address3);
        System.out.println(address4);
    }
}
