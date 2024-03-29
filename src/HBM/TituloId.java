package HBM;
// Generated 26-nov-2011 14:00:41 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.apache.commons.lang3.text.WordUtils;

/**
 * TituloId generated by hbm2java
 */
@Embeddable
public class TituloId  implements java.io.Serializable {


     private short deweyCategoriaDewey;
     private String idApellido;
     private String idTitulo;

    public TituloId() {
    }

    public TituloId(short deweyCategoriaDewey, String idApellido, String idTitulo) {
       this.deweyCategoriaDewey = deweyCategoriaDewey;
       
       // Pasamos los siguientes id a mayusculas para evitar problemas de no concordancia por 'case sensitive'
       this.idApellido = idApellido.toUpperCase();
       this.idTitulo = idTitulo.toUpperCase();
    }
   

    @Column(name="dewey_categoria_dewey", nullable=false)
    public short getDeweyCategoriaDewey() {
        return this.deweyCategoriaDewey;
    }
    
    public void setDeweyCategoriaDewey(short deweyCategoriaDewey) {
        this.deweyCategoriaDewey = deweyCategoriaDewey;
    }

    @Column(name="id_apellido", nullable=false, length=3)
    public String getIdApellido() {
        return this.idApellido;
    }
    
    public void setIdApellido(String idApellido) {
        this.idApellido = idApellido;
    }

    @Column(name="id_titulo", nullable=false, length=3)
    public String getIdTitulo() {
        return this.idTitulo;
    }
    
    public void setIdTitulo(String idTitulo) {
        this.idTitulo = idTitulo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TituloId) ) return false;
		 TituloId castOther = ( TituloId ) other; 
         
		 return (this.getDeweyCategoriaDewey()==castOther.getDeweyCategoriaDewey())
 && ( (this.getIdApellido()==castOther.getIdApellido()) || ( this.getIdApellido()!=null && castOther.getIdApellido()!=null && this.getIdApellido().equals(castOther.getIdApellido()) ) )
 && ( (this.getIdTitulo()==castOther.getIdTitulo()) || ( this.getIdTitulo()!=null && castOther.getIdTitulo()!=null && this.getIdTitulo().equals(castOther.getIdTitulo()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getDeweyCategoriaDewey();
         result = 37 * result + ( getIdApellido() == null ? 0 : this.getIdApellido().hashCode() );
         result = 37 * result + ( getIdTitulo() == null ? 0 : this.getIdTitulo().hashCode() );
         return result;
   }

    @Override
    public String toString() {
        return deweyCategoriaDewey + " - "+ idApellido + " - "+ idTitulo;
    }


}


