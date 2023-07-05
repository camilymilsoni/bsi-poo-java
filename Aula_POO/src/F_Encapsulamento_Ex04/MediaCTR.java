package F_Encapsulamento_Ex04;

public class MediaCTR {

    MediaDAO mediaDAO = new MediaDAO();
    
    public String calcular(MediaDTO mediaDTO){
        return mediaDAO.calcular(mediaDTO);
    }
    
}
