package util;

public class ValidatorUtil {
	
	public static boolean isCep(String cep) {
		return cep.matches("\\d{8}");
	}
	
	public static boolean isCpf(String cpf) {
		return cpf.matches("\\d{14}");
	}
	
	public static boolean isCnpj(String cnpj) {
		return cnpj.matches("\\d{11}");
	}
	
	public static boolean isCpfCnpj(String cpfCnpj) {
		return isCpf(cpfCnpj) || isCnpj(cpfCnpj);
	}

	public static boolean isIe(String ie) {
		return ie.matches("\\d{9}");
	}
	
	public static boolean isIm(String ie) {
		return ie.matches("\\d{8}");
	}
}
