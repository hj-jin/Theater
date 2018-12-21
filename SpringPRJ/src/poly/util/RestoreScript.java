package poly.util;

public class RestoreScript {
	public static String doRestore(String content) {
		String newContent = CmmUtil.nvl(content);
		if(!"".equals(content)) {
			newContent = newContent.replaceAll("& lt;", "<").replaceAll("& gt;", ">");
			newContent = newContent.replaceAll("& #40;", "\\(").replaceAll("& #41;", "\\)");
			newContent = newContent.replaceAll("& #39;", "'");
			newContent = newContent.replaceAll("\"\"", "[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']");
		}
		
		return newContent;
	}

}
