/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Hugo Carvalho
 */
public final class CustomDocumentFilter extends DocumentFilter {

    private final JTextPane jTextPane;
    private final StyledDocument styledDocument;
    private final StyleContext styleContext;
    private final AttributeSet blueAttributeSet;
    private final AttributeSet whiteAttributeSet;

    public CustomDocumentFilter(JTextPane jTextPane) {
        super();
        this.jTextPane = jTextPane;
        this.styledDocument = jTextPane.getStyledDocument();
        this.styleContext = StyleContext.getDefaultStyleContext();
        this.blueAttributeSet = styleContext.addAttribute(styleContext.getEmptySet(), StyleConstants.Foreground, Color.BLUE);
        this.whiteAttributeSet = styleContext.addAttribute(styleContext.getEmptySet(), StyleConstants.Foreground, Color.WHITE);
    }
    
    // Use a regular expression to find the words you are looking for
    Pattern pattern = buildPattern();

    @Override
    public void insertString(FilterBypass fb, int offset, String text, AttributeSet attributeSet) throws BadLocationException {
        super.insertString(fb, offset, text, attributeSet);

        handleTextChanged();
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        super.remove(fb, offset, length);

        handleTextChanged();
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attributeSet) throws BadLocationException {
        super.replace(fb, offset, length, text, attributeSet);

        handleTextChanged();
    }

    /**
     * Runs your updates later, not during the event notification.
     */
    private void handleTextChanged() {
        SwingUtilities.invokeLater(() -> {
            updateTextStyles();
        });
    }

    /**
     * Build the regular expression that looks for the whole word of each word
     * that you wish to find. The "\\b" is the beginning or end of a word
     * boundary. The "|" is a regex "or" operator.
     *
     * @return
     */
    private Pattern buildPattern() {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("step");
        for (String token : palavras) {
            sb.append("\\b"); // Start of word boundary
            sb.append(token);
            sb.append("\\b|"); // End of word boundary and an or for the next word
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1); // Remove the trailing "|"
        }

        Pattern p = Pattern.compile(sb.toString());

        return p;
    }

    private void updateTextStyles() {
        // Clear existing styles
        styledDocument.setCharacterAttributes(0, jTextPane.getText().length(), whiteAttributeSet, true);

        // Look for tokens and highlight them
        String matcherstr = jTextPane.getText().replaceAll("\n", "");
        Matcher matcher = pattern.matcher(matcherstr);
        while (matcher.find()) {
            // Change the color of recognized tokens
            styledDocument.setCharacterAttributes(matcher.start(), matcher.end() - matcher.start(), blueAttributeSet, false);
        }
    }
}
