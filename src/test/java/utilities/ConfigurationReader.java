package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFile;

    static {
        try {
            // Konfigürasyon dosyasının yolunu belirler
            String path = System.getProperty("user.dir") + "/configuration.properties";
            FileInputStream input = new FileInputStream(path);

            // Properties nesnesini oluşturur ve dosyayı okur
            configFile = new Properties();
            configFile.load(input);

            // Dosya akışını kapatır
            input.close();
        } catch (IOException e) {
            // Hata durumunda yığını yazdırır ve çalışma zamanında bir hata fırlatır
            e.printStackTrace();
            throw new RuntimeException("Konfigürasyon dosyası yüklenemedi!");
        }
    }

    /**
     * Bu metod, configuration.properties dosyasından belirtilen anahtarın değerini döner.
     *
     * @param keyName Konfigürasyon anahtarı
     * @return Anahtarın değeri
     */
    public static String getProperty(String keyName) {
        return configFile.getProperty(keyName);
    }
}
