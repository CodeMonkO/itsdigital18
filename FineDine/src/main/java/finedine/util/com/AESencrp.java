package main.java.finedine.util.com;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.digest.DigestUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class AESencrp {

	private final String ALGO = "AES";
	private byte[] keyValue;

	private void HashedKey(String password) {
		String salt = "v6vv6vgs3LYJ0Bv7IvBiEBTXL7Bv530KzPQVsAl9S3ckYyfY8agWJzjsTkyoTjAeWoLLY3Jf/pQBVGZgs3LYJ0Bvv6vgs3LYJ0Bv7IvBiEBTXL7Bv530KzPQVsAl9S3ckYyfY8agWJzjsTkyoTjAeWoLLY3Jf/pQBVGZ7Iv6vgs3Lv6vgs3LYJ0Bv7IvBiEBTXL7Bv530KzPQVsAl9S3ckYyfY8agWJzjsTkyoTjAeWoLLY3Jf/pQBVGZYJ0Bv7IvBiEBTXL7Bv530KzPQVsAl9S3ckYyfY8agWJzjsTkyoTjAeWoLLY3Jf/pQBVGZvBiEheufhkgsahgdf7623543278658092389632777(&*#&*(@^$&*#^$&*@^#&@!^#&*(%$&*#@!&Bgfhdsfgshfghasgkfjsahgdgfkjsgdfhsdjcsbvcbcvzbdgfhsageaebvnskdhrfwahsuietyiewurtquiwyeryhwiujvnmzxnbvgbgb57r78798644!!#@$#%$^%&^%*%*())*!*(&^@%^#@$!@#hjwhejfhsdfjksgkfjkdfjskdgb kcvkjx iorbvwe rtuererytuwyeruhshgoiq3e21349oipr3049689237833qIPWErf9sa08zsovposUISGAEIUFHOIAWEFJKOGOEHRGFNMBBTXL7Bv530KzPQVsAl9S3ckYyfY8agWJzjsTkyoTjAeWoLLY3Jf/pQBVGZ";
		password = DigestUtils.md5Hex(password + salt);
		keyValue = password.substring(0, 16).getBytes();
	}

	private String encrypt(String Data) throws Exception {
		Key key = generateKey();
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);
		byte[] encVal = c.doFinal(Data.getBytes());
		String encryptedValue = new BASE64Encoder().encode(encVal);
		return encryptedValue;
	}

	private Key generateKey() throws Exception {
		Key key = new SecretKeySpec(keyValue, ALGO);
		return key;
	}

	public String getEncryptedPassword(String password) throws Exception {
		HashedKey(password);
		String passwordEnc = encrypt(password);
		System.out.println("Plain Text : " + password);
		System.out.println("Encrypted Text : " + passwordEnc);
		System.out
				.println("Length Of Encrypted Text : " + passwordEnc.length());
		return encrypt(password);
	}

	private static AESencrp aesEncrp = null;

	public static AESencrp getInstance() {
		if (aesEncrp == null) {
			aesEncrp = new AESencrp();
		}
		return aesEncrp;
	}
}