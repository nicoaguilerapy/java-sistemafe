package CustomComponents;

import Dict.DictColores;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author USUARIO
 */
public class CustomButtom extends JButton {

    private final Border borderFocus = BorderFactory.createLineBorder(DictColores.BOTON_BORDER_FOCUS, 1);
    private final Border borderDefault = BorderFactory.createLineBorder(DictColores.BOTON_BORDER_DEFAULT, 1);

    public CustomButtom() {
        paintDefault();

        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (isEnabled()) {
                    paintFocus();
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (isEnabled()) {
                    paintDefault();
                }
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (isEnabled()) {
                    paintFocus();
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (isEnabled()) {
                    paintDefault();
                    setCursor(Cursor.getDefaultCursor());
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (isEnabled()) {
                    setBackground(Color.GRAY);
                }
            }
        });
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setCursor(enabled ? Cursor.getDefaultCursor() : Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        setBorder(enabled ? borderDefault : BorderFactory.createLineBorder(Color.GRAY, 1));
    }

    private void paintFocus() {
        setBorder(borderFocus);
        setForeground(DictColores.BOTON_BORDER_FOCUS);
    }

    private void paintDefault() {
        setBorder(borderDefault);
        setForeground(Color.BLACK);
        setBackground(Color.WHITE);
    }
}
