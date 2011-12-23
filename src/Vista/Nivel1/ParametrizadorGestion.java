/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Nivel1;

import Vista.Modelos.BaseTableModel;
import Controlador.TipoEvento;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manu
 */
public class ParametrizadorGestion {

    private String titulo;
    private BaseTableModel modeloTabla;
    private TipoEvento eventoAlta;
    private TipoEvento eventoBaja;
    private TipoEvento eventoModificar;

    public ParametrizadorGestion(String titulo, BaseTableModel modeloTabla, TipoEvento eventoAlta, TipoEvento eventoBaja, TipoEvento eventoModificar) {
        this.titulo = titulo;
        this.modeloTabla = modeloTabla;
        this.eventoAlta = eventoAlta;
        this.eventoBaja = eventoBaja;
        this.eventoModificar = eventoModificar;
    }

    public TipoEvento getEventoAlta() {
        return eventoAlta;
    }

    public TipoEvento getEventoBaja() {
        return eventoBaja;
    }

    public TipoEvento getEventoModificar() {
        return eventoModificar;
    }

    public BaseTableModel getBaseTableModel() {
        return modeloTabla;
    }

    public String getTitulo() {
        return titulo;
    }
}
