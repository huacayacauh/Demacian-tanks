package demaciatanks.scripteditor;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

public class ScriptEditor extends RSyntaxTextArea {

	private static final long serialVersionUID = -3906130901413802324L;
	
	String text_path;

	public ScriptEditor() {
	      setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_PYTHON);
	      setCodeFoldingEnabled(true);
	      text_path = null;
	}
	
	public void openPath(String path) {
		text_path = path;
		//String content = FileExplorer.open(path);
		//setText(content);
	}
	
	public String getPath() {
		return text_path;
	}

}
