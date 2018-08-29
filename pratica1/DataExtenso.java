/**
*
* @autor Micael Levi L. Cavalcante - 21554923
* @date  14 de out de 2016
*/

// http://stackoverflow.com/questions/17969436/java-regex-capturing-groups
// http://beginnersbook.com/2014/08/java-regex-tutorial/
// https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
// https://docs.oracle.com/javase/tutorial/essential/regex/groups.html

import java.util.*;
import java.util.regex.*;
public class DataExtenso {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String lido = s.nextLine();
		Pattern padrao = Pattern.compile("(\\d{2})(\\d{2})(\\d{4})");
		Matcher casados = padrao.matcher(lido);
		String dia="";
		String mes="";
		String ano="";
		while(casados.find()){
			dia = casados.group(1);
			mes = casados.group(2);
			ano = casados.group(3);
		}

		switch(mes){
		case "01": mes="janeiro"; break;
		case "02": mes="fevereiro"; break;
		case "03": mes="março"; break;
		case "04": mes="abril"; break;
		case "05": mes="maio"; break;
		case "06": mes="junho"; break;
		case "07": mes="julho"; break;
		case "08": mes="agosto"; break;
		case "09": mes="setembro"; break;
		case "10": mes="outubro"; break;
		case "11": mes="novembro"; break;
		case "12": mes="dezembro"; break;
		}

		System.out.println(dia + " de " + mes + " de " + ano);
	}

}
