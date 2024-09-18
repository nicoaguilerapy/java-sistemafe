package CustomComponents;

import Dict.DictColores;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.border.Border;

/**
 *
 * @author USUARIO
 */
public class CustomCheckBox extends JCheckBox {


    public CustomCheckBox() {
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

    private void paintFocus() {
        setForeground(DictColores.BOTON_BORDER_FOCUS);
    }

    private void paintDefault() {
        setForeground(Color.BLACK);
        setBackground(Color.WHITE);
    }
}
