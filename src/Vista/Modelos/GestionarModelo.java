/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Modelos;

/**
 *
 * @author nanohp
 */
public interface GestionarModelo {

    public void fijarModelo(Object object);

    public Object obtenerModelo();

    public void limpiarModelo();

    public void setEditable(boolean setEditable);

    public void setModo(String modo);
}
