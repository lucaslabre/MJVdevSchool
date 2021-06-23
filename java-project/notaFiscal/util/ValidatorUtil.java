package util;

public class ValidatorUtil {
	
	public static final int MAX_CPF = 11;
	public static final int MAX_CNPJ = 14;
	public static final int MAX_CEP = 8;
	public static final int MAX_IE = 9;
	public static final int MAX_IM = 8;
	
	public static boolean isCep(String cep) {
		return cep.matches(String.format("\\d{%s}", MAX_CEP));
	}
	
	public static boolean isCpf(String cpf) {
		return cpf.matches(String.format("\\d{%s}", MAX_CPF));
	}
	
	public static boolean isCnpj(String cnpj) {
		return cnpj.matches(String.format("\\d{%s}", MAX_CNPJ));
	}
	
	public static boolean isCpfCnpj(String cpfCnpj) {
		return isCpf(cpfCnpj) || isCnpj(cpfCnpj);
	}

	public static boolean isIe(String ie) {
		return ie.matches(String.format("\\d{%s}", MAX_IE));
	}
	
	public static boolean isIm(String ie) {
		return ie.matches(String.format("\\d{%s}", MAX_IM));
	}
}
