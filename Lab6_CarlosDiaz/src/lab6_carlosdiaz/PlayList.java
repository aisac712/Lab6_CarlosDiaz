package lab6_carlosdiaz;

import java.util.ArrayList;

public class PlayList {
    private String nombreP;
    ArrayList<Cancion> rolitas = new ArrayList();

    public PlayList() {
    }

    public PlayList(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public ArrayList<Cancion> getRolitas() {
        return rolitas;
    }

    public void setRolitas(ArrayList<Cancion> rolitas) {
        this.rolitas = rolitas;
    }

    @Override
    public String toString() {
        return nombreP + ", rolitas:" + rolitas;
    }
    
}
