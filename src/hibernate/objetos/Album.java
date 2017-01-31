package hibernate.objetos;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by Raquel on 31/01/17.
 */
@Entity
public class Album {
    private int id;
    private String tituloAl;
    private Date anio;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "titulo_al")
    public String getTituloAl() {
        return tituloAl;
    }

    public void setTituloAl(String tituloAl) {
        this.tituloAl = tituloAl;
    }

    @Basic
    @Column(name = "anio")
    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Album album = (Album) o;

        if (id != album.id) return false;
        if (tituloAl != null ? !tituloAl.equals(album.tituloAl) : album.tituloAl != null) return false;
        if (anio != null ? !anio.equals(album.anio) : album.anio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tituloAl != null ? tituloAl.hashCode() : 0);
        result = 31 * result + (anio != null ? anio.hashCode() : 0);
        return result;
    }
}
