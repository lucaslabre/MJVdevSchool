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
			if (cpfCnpj.matches(String.format("\\d{%s}", ValidatorUtil.MAX_CPF))){
				return formatCpf(cpfCnpj);
			}
			
			if (cpfCnpj.matches(String.format("\\d{%s}", ValidatorUtil.MAX_CNPJ))) {
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
	
	public static String repeatString(String str, Integer qtd) {
		return String.format("\n%s\n", str.repeat(qtd));
	}
	
	public static String insertLine(int qtd) {
		return repeatString("-", qtd);
	}
	
	public static String quebraLinha(String str, int qtd) {
		String text = "";
		int lenText = str.length();
		if (str.length() < qtd) {
			return String.format("%s%-24s", text,str);
		}
		return str.substring(0,qtd) + "\n" + quebraLinha(str.substring(24,lenText), qtd);
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
		String teste = "Welcome to the jungle guns n' roses disco de ouro duplo";
		System.out.println(quebraLinha(teste, 24));
		
	}
}
