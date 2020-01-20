package com.twitter.teruteru128.study.rsa.sample005;

import java.math.BigInteger;

import com.twitter.teruteru128.study.rsa.util.Util;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final BigInteger n = Util.N;
		final BigInteger a = new BigInteger(
				"46533689758410544315033324209232232041649211313899982548825257982378068384438521783282834771388717486759341110061845845624199483381289534305547121925312518038199710750533474958576184486383448732606714618004",
				10);
		final BigInteger b = new BigInteger(
				"21092409936813865222304899165543842936354466205170885874686507714841043213369571284076512315403972241847203827141826335783211783453031880338170757517745722664601181186691742464316928524095522194735998734984066846276062241014935425551718238596415092125649019811458629039760181259916658787268050037103939148076723995456879847644164746852994990385942947722657537421801747729322221184075723785064",
				10);
		final BigInteger minc = new BigInteger(
				"475128261198405915934942894094663046396014744850558984961922582559022890020098843436854592602697921871002368113174752609003099072196926756472499368070660479372644488988017615921276629823734290521575121635878500040949014774393855753282816302327825103530605730482748985787581820149234920752362337826252418220449207614192791255358356536807939381426799579387447598693919290708787784673753191345274130101599408964972",
				10);
		final BigInteger minx = new BigInteger(
				"21092409936813865222304899165543842936354466205170885874686507714841043213369571284076512315403972241847203827141826335783211783453031880338170757517745722664601181186691742464316928524070339696579638617172113194199294915558533215714409244456505579780838567983984828164694088244158760371912191598005937821816654487632070269520098515161367654098125504148807526825635595798952500969835184914777",
				10);
		final BigInteger maxc = new BigInteger(
				"475128261198405915934942894094663046396014744850558984961922582559022890020098843436854592602697921871002368113174752609003099072196926756472499368070660479372644488988017615921276629823734290521575121635853317542792654656581902101206048976871422893693296736342839473442771368321761119877296244810494519805093349175094789929098287028983129803302733347695820262406101847134937774077587039414904409887358870094685",
				10);
		final BigInteger maxx = new BigInteger(
				"21092409936813865222304899165543842936354466205170885874686507714841043213369571284076512315403972241847203827141826335783211783453031880338170757517745722664601181186691742464316928524095522194735998734984066846276062241014935425551718238596415092125649019811458629039760181259916658787268050037103939148076723995456879847644164746852994990385942947722657537421801747729322221184075723785064",
				10);

		BigInteger center = minx.add(maxx).shiftRight(1);
		BigInteger centerc = minc.add(maxc).shiftRight(1);
		System.out.println(minc.divide(a));
		BigInteger tmp = a.multiply(minx).add(b).mod(minc);
		System.out.printf("min(%dbit) : %d%n", tmp.bitLength(), tmp);
		BigInteger c_0 = minc.divide(a).add(BigInteger.valueOf(1L)).multiply(a)
				.mod(minc);
		BigInteger c_1 = minc.divide(a).add(BigInteger.valueOf(1L)).multiply(a)
				.mod(minc);
		tmp = a.multiply(minx.add(c_1)).add(b).mod(minc.subtract(c_1));
		System.out.printf("???(%dbit) : %d%n", tmp.bitLength(), tmp);
		tmp = a.multiply(center).add(b).mod(centerc);
		System.out.printf("ctr(%dbit) : %d%n", tmp.bitLength(), tmp);
		tmp = a.multiply(maxx).add(b).mod(maxc);
		System.out.printf("max(%dbit) : %d%n", tmp.bitLength(), tmp);
	}

}
