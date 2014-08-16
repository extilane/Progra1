//Librerias de uso
import java.io.*;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import org.blinkenlights.jid3.*;
import org.blinkenlights.jid3.v1.*;
import org.blinkenlights.jid3.v2.*;
import javax.sound.sampled.spi.AudioFileReader;
//import org.tritonus.share.sampled.file.TAudioFileReader;
//import org.tritonus.share.sampled.TAudioFor1mat;
//import org.tritonus.share.sampled.file.TAudioFileFormat;
public class MetaDatos
{
    private String Artista,Album,Titulo;
    private int anno,largo;
    
    public MetaDatos(){
    } //throws ID3Exception
        
    public void meta(String mp3) {
        
      
       
        //mp3 = "/mnt/hgfs/Ubunto/03 Obsesionario en LA Mayor.mp3";
        // the file we are going to read
        File oSourceFile = new File(mp3);
      /*  
        AudioFileFormat baseFileFormat;
        baseFileFormat = new MpegAudioFileReader().getAudioFileFormat(oSourceFile);
        Map properties = baseFileFormat.properties();
        Long duration = (Long) properties.get("duration");
*/
        // create an MP3File object representing our chosen file
        MediaFile oMediaFile = new MP3File(oSourceFile);

        // any tags read from the file are returned, in an array, in an order which you should not assume
        ID3Tag[] aoID3Tag = null;
        try {
            aoID3Tag = oMediaFile.getTags();
        } catch (ID3Exception ex) {
            Logger.getLogger(MetaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (ID3Tag aoID3Tag1 : aoID3Tag) {
            // check to see if we read a v1.0 tag, or a v2.3.0 tag (just for example..)
            if (aoID3Tag1 instanceof ID3V1_0Tag) {
                ID3V1_0Tag oID3V1_0Tag = (ID3V1_0Tag) aoID3Tag1;
                // does this tag happen to contain a title?
                if (oID3V1_0Tag.getTitle() != null)
                {
                    System.out.println("Title = " + oID3V1_0Tag.getTitle());
                }
               
                // etc.
            } else if (aoID3Tag1 instanceof ID3V2_3_0Tag) {
                ID3V2_3_0Tag oID3V2_3_0Tag = (ID3V2_3_0Tag) aoID3Tag1;
                // check if this v2.3.0 frame contains a title, using the actual frame name
                if (oID3V2_3_0Tag.getTIT2TextInformationFrame() != null)
                {
                    //oID3V2_3_0Tag.getPaddingLength()
                    //   System.out.println("Title = " + oID3V2_3_0Tag.getTIT2TextInformationFrame().getTitle());
                    //System.out.println(oID3V2_3_0Tag.getAlbum())
                }
                //System.out.println("Year = " + oID3V2_3_0Tag.getYear());
                //oID3V2_3_0Tag.setYear(500);
                //System.out.println("Year = " + oID3V2_3_0Tag.getYear());
                //System.out.println("Album = " + oID3V2_3_0Tag.getAlbum());
                //oID3V2_3_0Tag.setAlbum("tila se va a morir");
                // System.out.println("Album = " + oID3V2_3_0Tag.getAlbum());//
                // System.out.println("Artista = " + oID3V2_3_0Tag.getArtist());
                Artista=oID3V2_3_0Tag.getArtist();
                Album=oID3V2_3_0Tag.getAlbum();
                Titulo=oID3V2_3_0Tag.getTitle();
                oID3V2_3_0Tag.getExtendedHeader();
                try {
                    anno=oID3V2_3_0Tag.getYear();
                } catch (ID3Exception ex) {
                    Logger.getLogger(MetaDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
public int getDuracion(File file) {    
        return 0;
        

    

}


    public String getArtista(){
    return this.Artista;
    }
    public String getTitulo(){
    return this.Titulo;
    }
    public String getAlbum(){
    return this.Album;
    }
    public int getAnno(){
    return this.anno;
    }
    public int getLargo(){
    return largo;
    }
    public void setTitulo(String m){
    this.Titulo=m;
    }
    public void setArtista(String m){
    this.Artista=m;
    }
   
    
    
   
    }
    


