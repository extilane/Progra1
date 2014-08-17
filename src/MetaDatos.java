//Librerias de uso
import java.io.*;
//import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.sound.sampled.*;
//import org.blinkenlights.jid3.*;
//import org.blinkenlights.jid3.v1.*;
//import org.blinkenlights.jid3.v2.*;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.Tag;
//import org.tritonus.share.sampled.file.TAudioFileReader;
//import org.tritonus.share.sampled.TAudioFor1mat;
//import org.tritonus.share.sampled.file.TAudioFileFormat;
public class MetaDatos
{
    private String Artista,Album,Titulo,year;
    private int sec;
    int duracion;
    Tag tag;
    public MetaDatos(){
    } //throws ID3Exception
   /*     
   private static void getDurationWithMp3Spi(File file) throws UnsupportedAudioFileException, IOException {

    AudioFileFormat fileFormat = AudioSystem.getAudioFileFormat(file);
    if (fileFormat instanceof AudioFileFormat) {
        Map<?, ?> properties = ((AudioFileFormat) fileFormat).properties();
        String key = "duration";
        Long microseconds = (Long) properties.get(key);
        int mili = (int) (microseconds / 1000);
        int sec = (mili / 1000) % 60;
        int min = (mili / 1000) / 60;
        
    } else {
        throw new UnsupportedAudioFileException();
    }

}*/
    public void meta(String mp3){
        
      
       
       
        File oSourceFile = new File(mp3);
        try {
    AudioFile audioFile = AudioFileIO.read(oSourceFile);
    duracion = audioFile.getAudioHeader().getTrackLength();
    tag=audioFile.getTag();
    
    } catch (Exception e) {
    e.printStackTrace();

}
       /* // create an MP3File object representing our chosen file
        MediaFile oMediaFile = new MP3File(oSourceFile);
        //oMediaFile.getTags();
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
                
                oID3V2_3_0Tag.getExtendedHeader();
                try {
                    year=oID3V2_3_0Tag.getYear();
                } catch (ID3Exception ex) {
                    Logger.getLogger(MetaDatos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }*/     try{
                Artista=tag.getFirst(FieldKey.ARTIST);
                Album=tag.getFirst(FieldKey.ALBUM);
                Titulo=tag.getFirst(FieldKey.TITLE);
                year=tag.getFirst(FieldKey.YEAR);
        }catch(KeyNotFoundException e){
        
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
    public String getyear(){
    return this.year;
    }
    public int getLargo(){
    return duracion;
    }
    public void setTitulo(String m){
    this.Titulo=m;
    }
    public void setArtista(String m){
    this.Artista=m;
    }
   
    
    
   
    }
    


