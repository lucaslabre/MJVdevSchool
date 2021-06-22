package util;

public class FormatUtil {
	
	public static String formatCep(String cep) {
		if (ValidatorUtil.isCep(cep))
			return cep.replaceAll(("(\\d{2})(\\d{3})(\\d{3})"), "$1.$2-$3");
		return "CEP inválido";
	}
	
	private static String formatCnpj(String cnpj) {
		return cnpj.replaceAll(( "(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})" ), "$1.$2.$3/$4-$5" );
	}
	
	private static String formatCpf(String cpf) {
		return cpf.replaceAll( ( "(\\d{3})(\\d{3})(\\d{3})(\\d{2})" ) , "$1.$2.$3-$4");
	}
	
	public static String formatCpfCnpj(String cpfCnpj) {
		
		if (ValidatorUtil.isCpfCnpj(cpfCnpj)) {
			if (cpfCnpj.matches("\\d{11}")){
				return formatCpf(cpfCnpj);
			}
			
			if (cpfCnpj.matches("\\d{14}")) {
				return formatCnpj(cpfCnpj);
			}
		}
		return "CPF ou CPNJ inválido";
	}
	
	public static String formatIe(String ie) {
		if (ValidatorUtil.isIe(ie))
			return ie.replaceAll( ( "(\\d{3})(\\d{3})(\\d{3})" ) ,"$1.$2.$3");
		return "IE inválido";
	}
	
	public static String formatIm(String im) {
		if (ValidatorUtil.isIm(im))
			return im.replaceAll( ( "(\\d{2})(\\d{3})(\\d{3})" ) ,"$1.$2.$3");
		return "IM inválido";
	}

	public static void main(String[] args) {
		String cpf = "13639533704";
		System.out.println(FormatUtil.formatCpfCnpj(cpf));
		String cnpj = "92032784000101";
		System.out.println(formatCpfCnpj(cnpj));
		String erro = "938473928374.98";
		System.out.println(formatCpfCnpj(erro));
		String cep = "21852370";
		System.out.println(formatCep(cep));
	}
}
