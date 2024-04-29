package string_builder;

public class buildHTML {
	
	public static String htmlElement(String tag, String body) {
		StringBuilder str = new StringBuilder();
		if(tag == null && body==null) {
			return body;
		} else if(body == null || body.equals("")){
			str.append("<" + tag + "></" + tag + ">");
			return str.toString();			
		}
		str.append("<" + tag + ">" + body +"</" + tag + ">");
		return str.toString();
	}
	
	public static String strong(String str) {
		return htmlElement("strong", str);
	}
	
	public static String emphasizedString(String str) {
		return htmlElement("em", str);
	}
	public static void main(String[] args) {
		System.out.println(htmlElement("strong", "strong is bold"));
		System.out.println(strong(emphasizedString("strong + emphasized")));
		System.out.println(htmlElement("strong", null));
	}

}
