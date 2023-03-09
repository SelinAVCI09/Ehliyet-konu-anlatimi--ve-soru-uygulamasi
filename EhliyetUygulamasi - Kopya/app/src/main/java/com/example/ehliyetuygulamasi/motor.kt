package com.example.ehliyetuygulamasi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

class motor : AppCompatActivity() {
   // @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var textView: TextView

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_motor)
            textView=findViewById(R.id.textView)
            val text:String="MOTORUN TANIMI:Yakıtı ısı enerjisine,ısı enerjisini de hareket(mekanik)enerjisine çeviren makinelerdir.Motorlar;yakıtın yanma\n" +
                    "yerlerine,zamanlarına,kullanılan yakıtın cinsine,yağlama ve soğutma sistemlerine göre sınıflandırılırlar.\n" +
                    "Yakıtın yanma yerleri:1-İçten yanmalı,2-Dıştan yanmalı Motorlar\n" +
                    "Çalışma zamanlarına göre:\n" +
                    "İki zamanlı Motorlar:Pistonun iki hareketinde bir iş yaparlar.\n" +
                    "Dört zamanlı Motorlar: Pistonun dört hareketinde bir iş yaparlar.\n" +
                    "Yakıt cinslerine göre Motorlar:BENZİNLİ-DİZEL-LPG olarak ayrılır.\n" +
                    "Soğutma sistemleri:Su soğutmalı ve Hava soğutmalı motorlardır.\n" +
                    "DÖRT ZAMANLI BENZİNLİ MOTORLARDA ZAMANLAR:\n" +
                    "EMME ZAMANI-SIKIŞTIRMA ZAMANI-ATEŞLEME ZAMANI-EGZOZ ZAMANI\n" +
                    "DÖRT ZAMANLI DİZEL MOTORLARDA ZAMANLAR:\n" +
                    "EMME ZAMANI-SIKIŞTIRMA ZAMANI-YANMA ZAMANI-EGZOZ ZAMANI\n" +
                    "ATEŞLEME SİSTEMİ İLE İLGİLİ ÖNEMLİ NOTLAR\n" +
                    "1-Platin meme yaparsa meksefe arızalıdır.( otomobillerde, buji uçlarındaki yüksek gerilim atlamasının elektron alışverişi yanında\n" +
                    "kaynaklanma (meme oluşumu) yapmaması için kullanılır ve atlama davranışını \"ani\" değil, \"dengelenme\" şekline sokarlar. bu\n" +
                    "amaçla kullanılan kondansatörlere meksefe adı verilir.)\n" +
                    "2-Platin meme yaparsa zımpara ile temizlenir.\n" +
                    "3-Kontak anahtarı ateşleme durumunda açık bırakılırsa platin ve endüksiyon bobini yanabilir.\n" +
                    "4-Kullanma kılavuzuna göre belirli km de bir buji ve platin değiştirilir.\n" +
                    "5-Motorun çalışması sarsıntılı ise buji kablolarında biri çıkmış olabilir.\n" +
                    "6-Arka camın rezistanslı(ısıtıcılı)olmasının nedeni camda oluşan donma ve buğulanmayı önlemek içindir.\n" +
                    "7-Distribütörün parçaları:tevzi makarası-platin-meksefe\n" +
                    "8-Ateşleme sisteminin görevi silindirdeki yakıt-hava karışımını ateşlemek.\n" +
                    "9-Silindir içinde sıkıştırılmış olan yakıt-hava karışımını elektrik kıvılcımı ile ateşleyen parça buji dir.\n" +
                    "YAKIT SİSTEMİ İLE İLGİLİ ÖNEMLİ NOTLAR\n" +
                    "1-Katalitik konvektör kurşunsuz benzinli araçlarda kullanılır.Amaçı ekzoz gaz emisyonlarını azaltır.\n" +
                    "2-Araçta yakıt ikmali yapılırken motor stop edilir.\n" +
                    "3-Hava filitresi basınçlı hava ile temizlenir.\n" +
                    "4-Hava filitresi tıkalı ise zengin karışım olur.Eksoz dumanı siyah çıkar.\n" +
                    "5-Jikle çekili unutulursa zengin karışım olur.Eksoz dumanı siyah çıkar,motor boğulabilir.\n" +
                    "6-Boğulmuş motoru çalıştırmak için gaz pedalına sonuna kadar basılıp bir süre sonra marş yapılır.\n" +
                    "7-Motor ısınınca sıkça stop ediyor ise karbüratör ayarına bakılır.\n" +
                    "8-Soğuk motoru kolay çalıştırmak için zengin karışımı hazırlayan tertibat jikle dir.\n" +
                    "9-Yakıt pompası depoyla karbüratör arasındadır.\n" +
                    "10-Soğuk motoru kolay çalıştırmak için zengin karışımı hazırlayan tertibat jikle dir.\n" +
                    "11-LPG li araçların kapalı otoparklara kabul edilmesi yasaktır.\n" +
                    "12-Ani duruş ve kalkışlardan kaçınmak yakıt tasarrufu sağlar.\n" +
                    "AYARLAR:\n" +
                    "1-Karbüratör ayarı\n" +
                    "2-Supap ayarı\n" +
                    "3-Far ayarı\n" +
                    "KIŞ HAZIRLIĞI:Akü,Lastik,Silecek lastikleri ve Antifiriz kontrolü yapılır.\n" +
                    "DİZEL MOTORLAR:\n" +
                    "Enjektör,Kızdırma bujisi,Enjeksiyon pompası,\n" +
                    "1-Dizel motorlu araçlarda marşa basmadan önce göstergelerden kızdırma(ısınma)bujisi lambasının sönmesi beklenmelidir.Arızalı olursa araç\n" +
                    "geç çalışır.\n" +
                    "2-Dizel motorlarda motorin kullanılır.\n" +
                    "3-Dizel motorların egzozundan siyah duman çıkıyorsa yakıt enjeksiyon pompası arızalıdır.\n" +
                    "4-Enjeksiyon pompası mazotu silindire yüksek basınçla gönderir.\n" +
                    "5-Dizel motorlu araç çalışmıyorsa yakıt sisteminde hava olabilir.Yakıt boruları sökülürse(tamir için)yakıt sisteminde hava yapar.\n" +
                    "MARŞ SİSTEMİ İLE İLGİLİ ÖNEMLİ NOTLAR\n" +
                    "1-Marş dişlisi volana hareketini iletir.\n" +
                    "2-10-15 saniye arayla marş yapmalıyız.\n" +
                    "3-Motor çalışırken marş yaparsak marş dişlisi zarar görür.\n" +
                    "4-Marş yapıldığında yağ ve şarj göstergesinin sönmesi gerekir.\n" +
                    "5-Kontak anahtarı çevrildiğinde tık diye ses geliyorsa veya marş motoru görevini yapmıyorsa sebebi şunlardır\n" +
                    "a-Kutup başları gevşek yada oksitlenmiştir.\n" +
                    "b-Akümülatör boştur.\n" +
                    "6-Marş motoru görevini yapıyor(korna da çalıyor)ise ancak motor çalışmıyorsa sebebi şunlardır:\n" +
                    "a-Ateşleme sistemi arızalıdır.\n" +
                    "b-Yakıt sistemi arızalıdır.\n" +
                    "YAĞLAMA SİSTEMİ İLE İLGİLİ ÖNEMLİ NOTLAR\n" +
                    "1-Yağ lambası basınç göstermiyorsa motor hemen stop edilir.\n" +
                    "2-Kullanma klavuzuna göre belirli km de bir yağ ve yağ filitresi değiştirilir.\n" +
                    "3-Motor yağı günlük kontrol edilir.\n" +
                    "4-Motorun yağı kontrol etmek için yağın kartere inmesi için 4-6 dk beklenir ve araç düz bir zeminde tutulmalıdır.\n" +
                    "5-Yağ,yağ çubuğunun iki çizgisi arasında olmalı\n" +
                    "6-Motora yağ,subap muhafaza kapağının üzerindeki kapaktan(külbütör)konulur.\n" +
                    "aracın düz zeminde olmasına dikkat edilir.\n" +
                    "7-Motor,yağ yakarsa eksoz dumanı mavi çıkar.\n" +
                    "8-Motor,silindirler aşındıysa yağ yakar.\n" +
                    "9-Yağ değiştirileceği zaman motor sıcak olmalıdır.\n" +
                    "10-Karterdeki yağı motorun parçalarına gönderen yağ pompasıdır.\n" +
                    "11-Silindir kapak contası arızalandığında motor yağında su,soğutma suyunda yağ gözlenir.\n" +
                    "12-Motor yağ seviyesi normalin çok altında ise ve motor çalıştırılmaya devam edilirse Motor aşırı ısınır ve zarar görür.\n" +
                    "SOĞUTMA SİSTEMİ İLE İLGİLİ ÖNEMLİ NOTLAR:\n" +
                    "1-Soğutma suyu günlük olarak kontrol edilmelidir.\n" +
                    "2-Termostat silindir kapağının çıkışındadır.\n" +
                    "arabanın motorunda soğutma sistemi parçası olarak termostat, silindir kapağı su çıkışında bulunur..motorun\n" +
                    "sıcaklığını sabit tutar..termostatı çıkarılmış motor soğuk çalışır, geç ısınır, parçalar ısınır,\n" +
                    "3-Motorda termostat yok ise geç ısınır,aşınmalar artar.\n" +
                    "4-V kayışı gerginliği parmakla basıldığında 1,5 cm esnek olmalıdır.\n" +
                    "5-Hararet bir aracın radyatör kapağı havası alınır ve açılır.\n" +
                    "6-Hararet yapan bir araç stop edilmez rolentide çalıştırılır.\n" +
                    "7-Hararet yapan motora,araç rolentide çalışırken ılık ve saf su yavaş yavaş peteklerin üzerine kadar konulur.\n" +
                    "8-Radyatördeki suyun donmaması için antifiriz konulur.\n" +
                    "9-Soğutma sisteminde su,hava,antifirizli su kullanılır.\n" +
                    "ŞARZ SİSTEMİ İLE İLGİLİ ÖNEMLİ NOTLAR\n" +
                    "1-V kayışı çok sıkıysa alternatörün yatakları aşınır.\n" +
                    "2-Alternatörlü araçlarda elektirik kaynağı yapılacağı zaman kutup başları çıkartılır.\n" +
                    "3-Dijital göstergeli araçlarda akü takviyesi yapılmaz.\n" +
                    "4-Akü takviyesinde artı artıya eksi eksiye bağlanır.\n" +
                    "5-Regülatör(konjektör)arızalı ise,akü su eksiltir ve ampüller sıkça patlar.\n" +
                    "6-Akünün kutupları başları araca ters bağlanırsa Alternatör diyotları yanar.\n" +
                    "7-Alternatör:Hareket enerjisini elektirik enerjisine çevirmek.\n" +
                    "8-Akünün bakımı:\n" +
                    "a-plakaların 1cm üzerine kadar saf su ilave edilir.\n" +
                    "b-Kutupbaşları gevşek olmamalı ve oksitlenme varsa sıcak su veya sodalı su dökerek oksitlenme giderilmelidir.\n" +
                    "c-Akünün araç üzerinden sökülmesi sırasında önce Eksi kutba bağlı kablo sökülmelidir.\n" +
                    "AYDINLATMA SİSTEMİ İLE İLGİLİ ÖNEMLİ NOTLAR\n" +
                    "1-Sigorta attığı zaman aynı amper de yeni ile değiştirirlir.\n" +
                    "2-Farlarda arıza giderildikten sonra ve far değişimlerinde Farlarda far ayarı yapılır.\n" +
                    "3-Uzun farlar yanıyırsa,gösterge tablosunda mavi ışık yanar,\n" +
                    "4-Kısa farlar yandığında yeşil ışık yanar.\nGÜÇ AKTARMA (DEBRİYAJ) SİSTEMİ İLE İLGİLİ ÖNEMLİ NOTLAR\n" +
                    "1-Debriyaj pedalının üstünde sürekli ayağımızı basılı tutarsak,debriyaj balatası ve bilyası aşınır.\n" +
                    "2-Vites kutusu ve difrensiyale dişli yağı konur.\n" +
                    "3-Debriyajdan ani ve sert olarak ayağınızı çekerseniz balata aşınır.\n" +
                    "4-Difrensiyalin ana parçası mahruti ve ayna dişlisidir.\n" +
                    "5-Vites kutusu bakımı yapılırken yağı kontrol edilir.\n" +
                    "6-Vites değiştirilirken debriyaj pedalına basılır.\n" +
                    "7-Vites değiştirilirken debriyaj pedalı yavaşca bırakılırken gaz pedalına basılır ve kavrama gerçekleşir.\n" +
                    "8-Debriyaj kaçırıyorsa debriyaj balatası aşınmıştır.\n" +
                    "VİTES KUTUSU(ŞANZIMAN)\n" +
                    "- Vites kutusu ve difrensiyale dişli yağı konur\n" +
                    "ŞAFT(KARDAN MİLİ)\n" +
                    "Vites kutusundan aldığı hareketi diferansiyele aktarır.\n" +
                    "(son yıllarda üretilen araçlar önden çekişli olduğu için vites kutusu ve diferansiyel yan yanadır.Bu nedenle şaft bulunmaz.\n" +
                    "\n" +
                    "DİFERANSİYEL\n" +
                    "Şafttan aldığı hareketi AYNA MAHRİTİ ve İSTAVROZ DİŞLİLERİ ile 90 derece çevirerek AKS lara iletir.\n" +
                    "Dönemeçlerde içteki tekerleğin daha az devirde dönmesini sağlayarak aracın savrulmasını önler.Diferansiyeli önde olanlara önden\n" +
                    "çekişli arkada olanlara arkadan itişliaraçlar denir.\n" +
                    "\n" +
                    "TEKERLEKLER VE TEKERLEKLERDE ROTOSYON\n" +
                    "1-Lastikler,İç lastikler ve tubeless lastiller\n" +
                    "2-Tüm lastiklerin aşınma süresinin aynı olması için rotosyon yapılmalıdır.\n" +
                    "3-Rot ayarlarını bozuk olması lastiklerin aşınmasına sebep olur.\n" +
                    "4-Kullanma kılavuzuna göre lastik havalarının kontrolünü sağlamak\n" +
                    "5-Araç Lastikleri üzerinde bulunana rakamlar lastiğin ebatlarını gösterir.\n" +
                    "FREN SİSTEMİ İLE İLGİLİ ÖNEMLİ NOTLAR\n" +
                    "1-ABS Fren sisteminin faydası direksiyon hakimiyetini sağlamaktır.\n" +
                    "2-Fren sisteminde fren ayarı yapılır.\n" +
                    "3-Traktörün fren mandalları düz yolda kilitlenir.\n" +
                    "4-Ayak freninin diğer ismi servis frenidir.\n" +
                    "5-Havalı frenlerde komprasör dolmadıkça araç hareket ettirilmemelidir.\n" +
                    "6-Frene basıldığında ön ve arka tekerleklerin birlikte durması gerekir.\n" +
                    "7-Hidrolik yağının bakımı günlük yapılmalıdır.\n" +
                    "8-Westing haus lu araçlarda motor stop edilirse fren tutmaz.\n" +
                    "9-Havalı tip frenlerde komprasör dolmuyorsa rekorlarda kaçak vardır.\n" +
                    "10-Vakum hortumu çıktığında fren pedalı sertleşir.\n" +
                    "ÖN DÜZEN\n" +
                    "Direksiyon sistemi\n" +
                    "-Manevra yapmanızı sağlar.\n" +
                    "-Parçaları:direksiyon mili,direksiyon kutusu,rot ve rot başalarıdır.\n" +
                    "-Ayrıca EPS(Elektirikli Direksiyon simidi) kullanılmaktadır.\n" +
                    "-Direksiyon döndürme kuvvetini azaltarak sürücüye daha kolay manevra yapmasını sağlayan sistem HİDROLİK DİREKSİYON dur.\n" +
                    "SÜSPANSİYON SİSTEMİ\n" +
                    "-Helozon yaylar ve Amortisörler\n" +
                    "-Sarsıntı ve darbeleri üzerine alarak,seyahat konforu sağlamak ve aracın diğer elemanlarını sarsıntı ve darbelerden korumak.\n" +
                    "YENİ ARAÇLARDA İLK BAKIM(RODAJ)\n" +
                    "-Aracımızın uzun ömürlü olabilmesi için tüm parçaların belirli bir kilometre için de alışmalarını sağlamak\n" +
                    "-Bu süre içinde;ani kalkış,ani duruş,kullanma klavuzundaki belirtilen hızlarda kullanma ve aynı viteste uzun süre kullanmama.\n" +
                    "-1000-1500 km de ilk bakımlarının yapılmasını sağlamak.\n" +
                    "GÜVENLİ SÜRÜŞ VE ARAÇ KULLANMAYA HAZIRLIK.\n" +
                    "KOLTUK BAŞLIKLARI:\n" +
                    "-Başlık ayarları yapılır\n" +
                    "-Herhangi bir çarpışmada kafanın geriye doğru hareketini önler boyun ve omirilik sakatlanmalarını önler.\n" +
                    "-Başlıklara kafanızı dayıyarak araç sürülmez\n" +
                    "HAVA YASTIĞI(AİRBAG):\n" +
                    "-Hava yastıkları saniyenin yirmide biri kadar zaman diliminde yaklaşık 300 km süratle şişer.\n" +
                    "-Boyları 1.63 cm daha kısa olan insanların ön yolcu koltuğuna otururken altlarına minder koyarak yükselmeleri gerekir.\n" +
                    "-Hava yastığı ile vucudumuz arasında hiçbir şey olmamalı\n" +
                    "-Boyu uzun insanların koltuğa kayarak uyumaları boyunlarının kırılmasına sebep verecektir.\n" +
                    "-Çocuklar asla ön koltuğa oturamaz.\n" +
                    "EMNİYET KEMERİ:\n" +
                    "-50 km/sa hızda meydana gelen çarpmada ağırlığımız yaklaşık 40 misli artar.Örneğin 70 kiloluk bir insanın ağırlığı 2 ton 800 kg\n" +
                    "çıkacaktır.Böyle bir şoku emniyet kemersiz atlatmanız mümkün değildir.\n"
            textView.text=text
            textView.movementMethod= ScrollingMovementMethod()
    }
}