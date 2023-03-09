package com.example.ehliyetuygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

class trafik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trafik)
        lateinit var textView: TextView



            textView=findViewById(R.id.textView)
            val text:String="A ) Genel Tarifler:\n" +
                    "TRAFİK :Yayaların ve araçların karayolları üzerindeki hal ve hareketleridir.\n" +
                    "KARAYOLU (YOL) : Trafik için, kamunun yararlanmasına açık olan arazi şeridi, köprüler ve alanlardır.\n" +
                    "GEÇİŞ ÜSTÜNLÜĞÜ :Görev sırasında, belirli araç sürücülerinin can ve mal güvenliğini tehlikeye sokmamak şartı ile trafik kısıtlama ve yasaklarına bağlı olmamalarıdır.\n" +
                    "GEÇİŞ HAKKI : Yayaların veya araç kullananların, yolu kullanmak sırasındaki öncelik hakkıdır.\n" +
                    "DURMA : Her türlü trafik zorunlulukları dışında araçların insan indirmek ve bindirmek, eşya yüklemek,boşaltmak veya beklemek amacıyla kısa süre için durdurulmasıdır.\n" +
                    "PARK ETME : Araçların, durdurma ve duraklaması gereken haller dışında bırakılmasıdır..\n" +
                    "\n" +
                    "B ) Karayolu İle İlgili Tarifler:\n" +
                    "İKİ YÖNLÜ KARAYOLU :Taşıt yolunun her iki yöndeki taşıt trafiği için kullanıldığı karayoludur.\n" +
                    "TEK YÖNLÜ KARAYOLU : Taşıt yolunun yanlız bir yöndeki taşıt trafiği için kullanıldığı karayoludur.\n" +
                    "BÖLÜNMÜŞ KARAYOLU : Bir yöndeki trafiğe ait taşıt yolunun bir ayırıcı ile belirli şekilde diğer taşıt yolundan ayrılması ile meydana gelen karayoludur.\n" +
                    "ERİŞME KONTROLLÜ KARAYOLU (Otoyol - Ekspresyol) :\n" +
                    "Özellikle transit trafiğe tahsis edilen, belirli yerle ve şartlar dışında giriş ve çıkışın yasaklandığı,yaya, hayvan ve motorsuz araçların giremediği, ancak izinli motorlu araçların yararlandığı ve trafiğin özel kontrole tabi tutulduğu karayoludur.\n" +
                    "GEÇİŞ YOLU : Araçların bir mülke girip çıkması için yapılmış olan karayolu üzerinde bulunan kısmıdır.\n" +
                    "BAĞLANTI YOLU : Bir kavşak yakınında karayolu taşıt yollarının birbirine bağlanmasını sağlayan,kavşak alanı dışında bulunan karayoludur.\n" +
                    "BANKET : Yaya yolu ayrılmamış karayolunda, taşıt yolu kenarı ile şevbaşı veya hendek iç üst kenarı arasında kalan ve olağan olarak yayaların ve hayvanların kullanacağı, zorunlu hallerde de araçların faydalanabileceği kısımdır.\n" +
                    "PLATFORM : Karayolunun, taşıt yolu (kaplama) ile yaya yolu (kaldırım) veya banketinden oluşan kısmıdır.\n" +
                    "KAVŞAK : İki veya daha fazla karayolunun kesişmesi veya birleşmesi ile oluşan ortak alandır.\n" +
                    "TALİ YOL : Genel olarak üzerindeki trafik yoğunluğu bakımından bağlandığı yoldan daha az önemde olan yoldur.\n" +
                    "ANAYOL : Ana trafiğe açık olan ve bunu kesen karayolundaki trafiğin bu yolu geçerken veya bu yola girerken, ilk geçiş hakkını vermesi gerektiği işaretlerle belirlenmiş karayoludur.\n" +
                    "OKUL GEÇİDİ : Genel olarak okul öncesi, ilk öğretim ve orta dereceli okulların çevresinde özellikle öğrencilerin geçmesi için taşıt yolundan ayrılmış ve trafik işaretiyle belirlenmiş alandır.\n" +
                    "DEMİRYOLU GEÇİDİ (hemzemin geçit) : Karayolu ile demiryolunun aynı seviyede kesiştiği bariyerli veya bariyersiz geçitlerdir.\n" +
                    "\n" +
                    "\n" +
                    "C ) Araçlara İlişkin Tanımlar:\n" +
                    "OTOMOBİL :Yapısı itibariyle, sürücüsünden başka en çok yedi oturma yeri olan ve insan taşımak için imal edilmiş bulunan motorlu taşıttır. Bunlardan taksimetre veya tarife ile yolcu taşıyanlara taksi otomobil adam başına ücretle yolcu taşıyanlara dolmuş otomobil denir.\n" +
                    "MİNİBÜS : Yapısı itibariyle, sürücüsünden başka sekiz ile ondört oturma yeri olan ve insan taşımak için imal edilmiş bulunan motorlu taşıttır.\n" +
                    "OTOBÜS : Yapısı itibariyle, sürücüsünden başka en az onbeş oturma yeri olan ve insan taşımak için imal edilmiş bulunan motorlu taşıttır. Troleybüsler de bu sınıfa girer.\n" +
                    "KAMYONET : İzin verilebilen azami yüklü ağırlığı 3500 kg.'ı geçmeyen ve yük taşımak için imal edilmiş motorlu taşıttır.\n" +
                    "KAMYON : İzin verilebilen azami yüklü ağırlığı 3500 kg.'dan fazla olan ve yük taşımak için imal edilmiş motorlu taşıtlardır.\n" +
                    "ÇEKİCİ : Romörk ve yarı romörkları çekmek için imal edilmiş olan ve yük taşımayan motorlu taşıtlardır.\n" +
                    "ARAZİ TAŞITI : Krayollarında yolcu ve yük taşıyabilecek şekilde imal edilmiş olmakla beraber, bütün tekerlekleri motordan güç alan motorlu taşıttır.\n" +
                    "GABARİ : Araçların, yüklü veya yüksüz olarak karayolunda güvenli seyirlerini temin amacı ile uzunluk, genişlik ve yüksekliklerini belirleyen ölçüdür. (Genişlik:2,5 m ; Yükseklik:4 m)\n" +
                    "AZAMİ AĞIRLIK :Taşıtın güvenle taşıyabileceği azami yüklü ağırlığı.\n" +
                    "DİNGİL AĞIRLIĞI:Araçta aynı dingile bağlı tekerleklerden, karayolu yapısına aktarılan ağırlıktır. (Tek dingil: 10 ton, iki dingil 18 ton)\n" +
                    "\n" +
                    "D ) TRAFİK POLİSİNİN HAREKETLERİ\n" +
                    "Trafik polisinin duruş ve pozisyonuna göre, polis hazırolda veya kollarını açmış ise trafik polisinin ön ve arka kısmı trafiğe kapalı, sağ ve sol tarafı trafiğe açıktır.\n" +
                    "Trafik polisi elinin birini havaya kaldırmışsa bütün yollar trafiğe kapalıdır.\n" +
                    "\n" +
                    "E ) IŞIKLI TRAFİK İŞARET CİHAZLARI<\n" +
                    "1) Kırmızı ışık: Yolun trafiğe kapalı olduğunu gösterir. Aksine bir işaret yoksa, durup beklenir.\n" +
                    "2) Sarı ışık: Uyarı anlamındadır. Kırmızı ışıkla birlikte yanarsa hazırlan yol trafiğe açılmak üzeredir. Yeşil ışıkla birlikte yanarsa yol trafiğe kapanmak üzeredir.\n" +
                    "3) Yeşil ışık: Yolun trafiğe açık olduğunu gösterir.\n" +
                    "4) Fasılalı ışık: Kırmızı ise dur, sarı ise dikkatli geç anlamındadır.\n" +
                    "5) Yazılı ve sesli ışık: Araç trafiğine göre yaya trafiğini düzenler ve yayalara hitap eder.\n" +
                    "\n" +
                    "\n" +
                    "F ) YOL ÇİZGİLERİ\n" +
                    "Devamlı yol çizgileri:İki şerit ve iki yönlü karayolunda, dönemeç tepe üstü, kavşak yaya ve okul geçidi, demiryolu geçidi, dar köprü ve tünel gibi yerlerin yaklaşımında şerit değiştirilemeyeceğini ve öndeki araçların geçilemeyeceğini belirler. Kesik yol çizgileri: Trafik kurallarına uymak şartıyla sürücülerin, yol ve trafik durumuna uygun olduğunda, öndeki araçları geçmek için şerit değiştirebileceğini gösterir. Devamlı ve kesik yol çizgileri:Yanyana çizilmiş devamlı ve kesik yol çizgilerinin bulunduğu yerlerde sürücüler, manevra başlangıcında kendilerine en yakın olan çizginin anlamına göre davranırlar. Yanyana iki devamlı çizgi:Bu çizgi, yolu bölünmüş yol durumuna getirdiğinden, bu çizgi boyunca karşı yönün kullandığı şeritlere girilmez.NOT: Bir kişi sürekli olarak 5 saat, yarım saat dinlendikten sonra 4 saat daha araç kullanabilir. 24 saatte bir kişi toplam 9 saat araç kullanabilir. NOT: Alkollü iken araç kullananlara para, puan ve 3 ay trafikten men cezası verilir. Uyuşturucu kullananlara sürekli olarak trafikten men, para ve hapis cezası verilir. NOT: Bir yıl içinde 100 hata puanını dolduranlara 2 ay trafikten men, aynı yıl içerisinde 2 defada 100 hata puanını dolduranlara 4 ay trafikten men, 3 defa dolduranlara tamamen trafikten men cezası verilir.\n" +
                    "\n" +
                    "\n" +
                    "G ) KARAYOLUNUN KULLANILMASI KURALLARI\n" +
                    "Karayolları,toplumun her kesiminin yararlandığı,kamuya açık,dolayısıyla,konulan kurallara,kısıtlamalara,yasaklara uyulması gereken yerlerdir. Karayollarımızda trafiğin akışı sağdandır. Aksine bir işaret veya hüküm bulunmadıkça araç sürücüleri aşağıdaki kurallara uymak zorundadır.\n" +
                    "Sürücüler:\n" +
                    "1- Araçlarını, durumun elverdiği oranda gidiş yönüne göre yolun en sağından sürmek.\n" +
                    "2- Yol çok şeritli ise, trafik durumuna göre hızının gerektirdiği şeritten gitmek.\n" +
                    "3- Şerit değiştirmeden önce, gideceği şeritte araçların güvenle geçişlerinin tamamlamalarını beklemek.\n" +
                    "4- Trafiği aksatacak ya da tehlikeye sokacak şekilde şerit değiştirmemek.\n" +
                    "5- Gidişe ayrılan yol bölümünün en sol şeridini sürekli olarak işgal etmemek.\n" +
                    "6- İki yönlü, dört veya daha fazla şeritli yollarda, motosiklet, otomobil, kamyonet, minibüs ve otobüs dışındaki araçları sürenler, geçme ve dönme dışında en sağ şeridi izlemek zorundadırlar.Ayrıca sürücülerin;\n" +
                    "1- Geçme, durma, duraklama, dönme ve park etme gibi haller dışında şerit değiştirmeleri.\n" +
                    "2- İki şeridi birden kullanmaları.\n" +
                    "3- Araçların cinsine ve hızına uygun olmayan şeritten gitmeleri.\n" +
                    "4- Kavşaklara yaklaşırken, yerleşim yerleri içinde 30 metre, dışında 150 metre mesafe içinde şerit değiştirmeleri.\n" +
                    "5- İşaret vermeden şerit değiştirmeleri yasaktır.\n" +
                    "\n" +
                    "\n" +
                    "B)H ) HIZ KURALLARI\n" +
                    "Aksine işaret bulunmadıkça yerleşim yeri dışında ve içinde römorksuz taşıt cinsleri için en çok hız sınırları aşağıda gösterilmiştir.\n" +
                    "ARACIN CİNSİ\n" +
                    "Yerleşim yerlerinde\n" +
                    "Yerleşim yeri dışında\n" +
                    "Otomobillerde\t50km/s\t90km/s\n" +
                    "Otobüs, minibüs, kamyon ve kamyonetlerde\t50km/s\t80km/s\n" +
                    "Arazi taşıtlarıyla motosikletlerde\t50km/s\t70km/s\n" +
                    "Tehlikeli madde taşıyıcılar ile özel yük taşıma izni belgesiyle veya özel izin belgesiyle karayoluna çıkan araçlarda\t30km/s\t50km/s\n" +
                    "Motorlu bisiklet ve bisikletlerde\t30km/s\t50km/s\n" +
                    "Traktör, arızalı bir aracı çeken araçlarda ve iş makinasında\t20km/s\t20km/s\n" +
                    "\n" +
                    "Not:Römorksuz bir araca römork takılırsa, aracın hızı saate 10 km. daha düşük olmalı. Takip mesafesi: Hareket halindeki iki araç arasındaki mesafeye denir. Takip mesafesi hızın yarısı kadar mesafedir. Örneğin hızı 90km/s olan bir aracın takip mesafesi 45m olmalıdır.\n" +
                    "Not: Bir aracın 2 saniyede kat ettiği yol takip mesafesi kadardır.\n" +
                    "\n" +
                    "I ) ÖNDEKİ ARACI GEÇME KURALI\n" +
                    "Sürücülerin önlerinde giden aracı geçmeleri için:\n" +
                    "1. Arkasından gelen bir başka sürücünün geçmeye başlamamış olmasına,\n" +
                    "2. Önünde giden sürücünün bir başka aracı geçme niyetini belirten uyarma işaretini vermemiş bulunmasına.\n" +
                    "3. Geçeceği aracın hızıyla, geçme esnasındaki kendi hızını da dikkate alarak, iki yolarda da karşıdan gelen trafik dahil, yolu kullananların tümü için tehlike veya engel yapmadan geçme için kullanacağı şeridin yeteri kadar ilerisinin görüşe açık ve boş olmasına,\n" +
                    "4. Geçişin, geçilen araçlar için bir güçlük yaratmayacak şekilde ve araçlarının bu geçişe uygun durumda bulunmasına dikkat etmeleri mecburidir.\n" +
                    "\n" +
                    "J ) ÖNDEKİ ARACI GEÇMENİN YASAK OLDUĞU YERLER\n" +
                    "Sürücüler;\n" +
                    "1. Geçmenin herhangi bir trafik işaretiyle yasaklandığı yerlerde\n" +
                    "2. Köprülerde, tünellerde, kavşaklarda, demiryolu geçitlerinde, görüşün yetersiz olduğu tepe üstü ve virajlarda, önlerindeki araçları geçmeleri yasaktır.\n" +
                    "Sağa dönüşler:\n" +
                    "1. Dönüş işareti vermeye,\n" +
                    "2. Sağ şeride veya işaretle dönüş izni verilen şeride girmeye,\n" +
                    "3. Hızını azaltmaya,\n" +
                    "4. Dar bir kavisle dönüş yapmaya mecburdurlar.\n" +
                    "Sola dönüşler:\n" +
                    "1. Dönüş işareti vermeye,\n" +
                    "2. Yolun gidişe ayrılmış olan kısmının soluna yanaşmaya,\n" +
                    "3. Hızını azaltmaya,\n" +
                    "4. Dönüşe başlamadan, varsa sağdan gelen taşıtlara ilk geçiş hakkını vermeye,\n" +
                    "5. Dönüş sırasında, karşıdan gelen ve emniyetle duramayacak kadar kavşağa olan araçların geçmesini beklemeye,\n" +
                    "6. Gireceği yolun gidişe ayrılan kısmına girmek üzere, arkadan gelen ve sola dönecek diğer taşıtları engellememek için dönüşünü geniş kavisle yapmaya,\n" +
                    "7. Dönüş sırasında ilk geçiş hakkını, kurallara uygun olarak karşıya geçen yayalara, varsa bisiklet yolundaki bisikletlere vermeye mecburdurlar.\n" +
                    "Araç sürücülerinin:\n" +
                    "1- Bağlantı yollarında geri gitmeleri,\n" +
                    "2- Tek yönlü yollarda, duraklama veya park manevrası dışında geri gitmeleri,\n" +
                    "3- İki aracın emniyetle geçemeyeceği kadar dar olan iki yönlü yol kesimlerinde, karşılama ve geçiş kolaylığı dışında, geri gitmeleri,\n" +
                    "4- Daha geniş yollarda geriye giderken manevra dışında şerit değiştirmeleri,\n" +
                    "5- Trafiği yoğun olan yollarda geriye dönmeleri yasaktır.\n" +
                    "Trafik polisi, ışıklı trafik işaret cihazları veya trafik işaret levhaları bulunmayan kavşaklarda;\n" +
                    "1- Bütün araçlar geçiş üstünlüğüne sahip araçlara görev anındayken öncelik verir. 2- Bütün sürücüler doğru geçmekte olan tramvay hattı bulunan yoldan geçen araçlara,\n" +
                    "3- Bölünmüş yola çıkan sürücüler bu yoldan geçen araçlara,\n" +
                    "4- Tali yoldan çıkan sürücüler ana yoldaki sürücülere,\n" +
                    "5- Dönel kavşak dışındaki sürücüler, dönel kavşak içindeki araçlara,\n" +
                    "6- Bir iz veya mülkten karayoluna çıkan sürücüler,karayolundaki araçlara ilk geçiş hakkını vermek zorundadır.\n" +
                    "\n" +
                    "K ) GEÇİŞ ÜSTÜNLÜĞÜ\n" +
                    "Görev sırasında, belirli araç sürücülerinin, can ve mal güvenliğini tehlikeye sokmamak şartıyla, trafik kısıtlama ve yasaklamalarına bağlı olmamalarına denir.\n" +
                    "1- Ambulanslar\n" +
                    "2- İtfaiye araçları\n" +
                    "3- Polis araçları\n" +
                    "4- Sivil savunma araçları\n" +
                    "5- Koruyan ve korunan araçlar\n" +
                    "NOT: Geçiş üstünlüğüne sahip araçların 150 metreden görülür lambaları olmalıdır. 150 metreden duyulur sirenleri olmalıdır.\n" +
                    "NOT: Sarı tepeli lambalı araçlar geçiş üstünlüğüne sahip değildir. Sarı tepe lambası araçlara kendilerini belli etmek için takarlar diğer araç kullananlar da daha dikkatli araç kullanırlar.\n" +
                    "\n" +
                    "L ) DURAKLAMANIN YASAK OLDUĞU YERLER:\n" +
                    "1- Duraklamanın yasaklandığının bir trafik işaretiyle belirtilmiş olduğu yerlerde.\n" +
                    "2- Sol şeritte (raylı sistemin bulunduğu yollar hariç).\n" +
                    "3- Yaya ve okul geçitleri ile diğer geçitlerde.\n" +
                    "4- Kavşaklar, tüneller, rampalar ve bağlantı yollarında ve buralarda yerleşim merkezleri içinde 5 metre , yerleşim merkezleri dışında 100 metre mesafede.\n" +
                    "5- Görüşün yeterli olmadığı tepe üstlerine yakın yerlerde ve dönemeçlerde.\n" +
                    "6- Duraklayan veya park eden araçların yanında.\n" +
                    "7- Otobüs ve taksi duraklarında.\n" +
                    "8- İşaret levhalarına, yaklaşım yönünde ve park izni verilen yerler dışında, yerleşim birimi içinde 15 metre, yerleşim birimi dışında 100 metre mesafede.\n" +
                    "9- Zorunlu haller dışında, yerleşim yerleri dışındaki karayollarında, taşıt yolu üzerinde duraklamak yasaktır.\n" +
                    "NOT: Duraklamanın yasak olduğu her yerde park etmek de yasaktır.\n" +
                    "\n" +
                    "M) PARK ETMENİN YASAK OLDUĞU YERLER:\n" +
                    "NOT: Duraklamanın yasak olduğu her yerde park etmek de yasaktır.\n" +
                    "\n" +
                    "N ) Araç Işıklarının Kullanılması\n" +
                    "a) Uzağı gösteren ışıklar (uzun hüzmeli farlar):\n" +
                    "Yerleşim birimleri dışındaki karayollarında geceleri seyrederken, yeterince aydınlatılmamış tünellere girerken, benzeri yer ve hallerde uzağı gösteren ışıkların yakılması zorunludur.\n" +
                    "b) Yakını gösteren ışıklar (kısa hüzmeli farlar):\n" +
                    "Geceleri, yerleşim birimleri dışında karayollarındaki karşılaşmalarda bir aracı takip ederken, bir aracı geçerken yan yana gelinceye kadar ve yerleşim birimleri içinde, gündüzleri ise görüşü azaltan sisli, yağışlı ve benzeri havalarda yakını gösteren ışıkların yakılması mecburidir.\n" +
                    "NOT: Kısa farla 25 m. , uzun farlar 100 m. ileriyi aydınlatır.\n" +
                    "Işıkların kullanılmasına ilişkin esaslar:\n" +
                    "1-Dönüş ışıklarının geç anlamında kulanılması,\n" +
                    "2-Sadece park ışıkları yakılarak araç sürülmesi,\n" +
                    "3- Karşılaşmalarda ışıkların söndürülmesi,\n" +
                    "4- Yönetmeliklerde gösterilen esaslara aykırı ışık takılması ve kullanılması,\n" +
                    "5- Sis ışıklarının; sis, kar, şiddetli yağmur halleri dışında ve geceleri yakını ve uzağı gösteren ışıklarla aynı zamanda kullanılması,\n" +
                    "6- Yönetmelik esaslarına uygun olarak takılan ışıkların da amaç dışında ve gereksiz kullanılması yasaktır.\n" +
                    "\n" +
                    "O ) Arızalı Araçların Çekilmesi\n" +
                    "1- Freni arızalı olmayan araçların çekilmesi.\n" +
                    "-Çekme halatı, çekme zinciri veya çekme demiri ile çekilir.\n" +
                    "-Çekme halatının uzunluğu en fazla 5m. olmalıdır.\n" +
                    "-Halatın uzunluğu 2,5m. geçerse kırmızı yansıtıcı bağlanmalı.\n" +
                    "-Hız saatte 20km olmalı.\n" +
                    "2- Freni arızalı olan araçların çekilmesi:\n" +
                    "Çeki demiri ile çekilmeli.\n" +
                    "-Demir uzunluğu en fazla 1m. olmalı.\n" +
                    "-Hız saatte 15km. geçmemeli.\n" +
                    "NOT: Her iki durumda da yolcu ve yük taşınmamalı.\n" +
                    "\n" +
                    "P ) Okul Taşıtlarının Çalıştırılma Esasları\n" +
                    "1- Okul taşıtının DUR işareti yakıldığında, diğer bütün araçlar duracak, öğrenci indirme bindirme işlemi bitinceye kadar okul taşıtı geçilmeyecektir.\n" +
                    "2- DUR işareti sadece öğrenci indirme bindirme işlemi sırasında yakılacak,bu ışık frene basıldığında yanan ışıkla birlikte yanmayacak.\n" +
                    "3- Okul taşıtlarına, taşıma sınırını aşacak sayıda öğrenci bindirilmeyecektir.\n" +
                    "4- Taşıt içi düzenini sağlamak ve taşıta iniş ve binişlerde öğrenciye yardımcı olmak üzere okul taşıtında bir rehber öğretmen veya kişi bulunacaktır.\n" +
                    "5- Öğrencilerin kolayca yetiştiği cam ve pencereler sabit olacaktır.\n" +
                    "NOT: Okul taşıtlarının arkasında 30cm. çapında kırmızı dur lambası olmalıdır.\n" +
                    "NOT: Hatalı park olursa parasını araç sürücüsü ya da sahibi öder.\n" +
                    "NOT: Şehir merkezinde kamyon, otobüs ve traktör park yapamaz.\n" +
                    "\n" +
                    "R ) Tehlikeli Madde Taşınması\n" +
                    "Tehlikeli madde taşıyan araçlar, şehir içerisinde 30km. şehir dışında 50km. hızla gidebilir. (Eğer boş ise, kendi sınıfının hızı ile)\n" +
                    "NOT: Dolum veya boşaltım sırasında kıvılcım çıkaran nesnelere en fazla 30m.yaklaşır, park anında 20m. takip mesafesi 50m. olmalıdır.\n" +
                    "NOT: Tehlikeli madde taşıyan araçlarda 6kg. iki adet yangın söndürme cihazı ve tamizlik anında tanker içindeki aydınlatma feneri de 6 voltluk pil olmalıdır.\n" +
                    "NOT: Arıza anında başka bir gözcü bulunmalıdır.\n" +
                    "\n" +
                    "S ) Otoyol Kuralları\n" +
                    "Erişme kontrollü karayolu:\n" +
                    "Özellikle transit trafiğe tahsis edilen, belirli yerler ve şartlar dışında giriş ve çıkışın yasaklandığı, yaya, hayvan ve motorsuz araçların giremediği, ancak izin verilen motorlu araçların yararlandığı ve trafiğin özel kontrole tabi tutulduğu karayoludur.\n" +
                    "\n" +
                    "Otoyola her yerden giriş veya çıkış yasaklanmıştır. Buralara ancak özel yerlerden girilir veya çıkılır ki buralara girişte hizalanma şeridi çıkışta ise yavaşlama şeridi denir. Duraklamak, park etmek, geri gitme, geri dönüş YASAKTIR.\n" +
                    "\n" +
                    "T ) Motorlu Taşıtlarda Trafiğe Katılma ve Tescil işlemleri\n" +
                    "Araç sahipleri araçlarını yönetmelikte belirtilen esaslara göre yetkili tescil kuruluşuna tescil ettirmek ve tescil belgesi almak zorundadır.\n" +
                    "Tescili zorunlu olan ve daha önce tescili yapılmamış bir aracı satın alan veya gümrükten çeken araç sahipleri:\n" +
                    "->Satın alma veya gümrükten çekme tarihinden itibaren üç ay içinde gerekli bilgi ve belgelerle birlikte yazılı olarak yetkili tescil kuruluşuna müracaat etmek zorundadırlar.\n" +
                    "2- Tescili araçları NOTER senediyle satın veya devir alan araç sürücüleri, aracı adına tescil ettirmek üzere:\n" +
                    "->Gerekli bilgi ve belgelerle birlikte bir ay içinde yetkili tescil kuruluşuna müracaat etmek zorundadırlar.\n" +
                    "3- Tescil edilerek tescil belgesi alınan araçların karayoluna çıkabilmesi için ayrıca TRAFİK BELGESİ ve TESCİL PLAKALARI' nı alması gerekir.\n" +
                    "4- Tescil belgesi, trafik belgesi ve tescil plakaları araç üzerinde hazır ve uygun durumda bulundurmadan araç trafiğe çıkamaz.\n" +
                    "5- Tescil işlemleri geciken araçların geçici olarak trafiğe çıkarılıp karayolunda kullanılması için: Geçici trafik belgesi ve Geçici trafik plakaları alınması mecburidir.\n" +
                    "6- Tescil plakalarının araç üzerinde ve uygun durumda bulundurulması yanında ışıkların yakılması ile birlikte arka plakaların 20 metre mesafeden okunabilecek şekilde aydınlatılmış ve temiz olmalıdır.\n" +
                    "7- Motorlu bir aracın işletilmesi ve herhangi bir kazaya karışması gibi durumlara karşı MALİ SORUMLULUK SİGORTASI yaptırması zorunludur.\n" +
                    "8- Motorlu araç sürücüleri: trafik zabıtası (polisi) tarafından yapılacak denetim ve kontrol sırasında,\n" +
                    "a) sürücü belgesini\n" +
                    "b) tescil belgelerini\n" +
                    "c) trafik belgesini\n" +
                    "d) mali sorumluluk sigorta poliçesini ve tescil plakalarını göstermek zorundadır.\n" +
                    "9- Araç sahipleri ekonomik ömrünün dolması, kaza, yangın, tahrip edilme veya benzeri sebeplerle hurdaya ayırdıkları araçların tescilinin silinmesi için hurdaya ayırma tarihinden itibaren 1 ay içinde ilgili tescil kuruluşuna dilekçe ile müracaat etmek zorundadır.\n" +
                    "\n" +
                    "U ) ARAÇLARIN MUAYENE MECBURİYETLERİ VE SÜRELERİ\n" +
                    "1) Hususi otomobiller ile bunların her türlü römorkları:\n" +
                    "- Trafiğe çıkarılışından sonra ilk 3 yaş sonunda ve devamında her 2 yılda bir.\n" +
                    "- Resmi ve ticari plakalı e bunların her türlü römorkları: İlk trafiğe çıkışından itibaren ilk 2 yaş sonunda devamında yılda 1.\n" +
                    "- Lastik tekerlekli traktörler ve bunların her türlü römorkları:\n" +
                    "İlk trafiğe çıkışından itibaren ilk 3 yaş sonunda ve devamında her 3 yılda bir.\n" +
                    "Diğer bütün motorlu araçlar ile bunların her türlü römorkları ilk bir yaş sonunda ve devamında her yıl.\n" +
                    "periyodik muayeneye tabi tutulur.\n" +
                    "2) Motorlu taşıtın muayene süresi dolmamış olsa bile;\n" +
                    "-Kazaya karışması sonucu yetkili zabıtaca muayenesi görülen araçlar,Üzerinde değişiklik yapılan araçlar ayrıca özel muayeneye tabi tutulurlar.\n" +
                    "3) Araç üzerinde yönetmelikte belirtilen şekilde yapılacak her türlü değişikliğin araç sahibi tarafından 30 gün içinde yetkili tescil kuruluşuna bildirilmesi mecburidir.\n" +
                    "4) Uyuşturucu ve keyif verici maddeleri almış olanlar:\n" +
                    "-Derhal araç kullanmaktan men olurlar.\n" +
                    "-Mahkeme kararıyla para ve hapis cezası ile cezalandırılır, sürücü belgesi süresiz olarak geri alınır.\n" +
                    "\n" +
                    "V ) Asli Kusurlar\n" +
                    "1. Kırmızı ışıkta geçmek.Trafik polisinin dur ikazına uymamak.\n" +
                    "2. Şeride tecavüz etmek.\n" +
                    "3. Bir araca arkadan çarpmak.\n" +
                    "4. Karşı yönden gelen şerit ve yol bölümünden gitmek.\n" +
                    "5. Sollama kurallarına uymadan araç sollamak.\n" +
                    "6. Dönüş kurallarına uymamak.\n" +
                    "7. Daralan yollarda öncelik hakkına uymamak.\n" +
                    "8. Şehirler arası yollarda park yapmak.\n" +
                    "NOT: Alkollü araç kullanmak,hız limitini aşarak araç kullanmak, ehliyetsiz araç kullanmak ASLİ KUSUR DEĞİLDİR.\n" +
                    "\n" +
                    "Z ) Çevre Bilgisi\n" +
                    "NOT: Katalitik konvektör;\n" +
                    "zehirli gazların zehirleyicilik özelliğini azaltır.\n" +
                    "NOT: Bir bölgenin bitki topluluğuna flora ,hayvan topluluğuna fauna denir.\n" +
                    "NOT: Ekzosdan dışarıya %3,5 ile %4,5 arasında karbonmonoksit atılabilir."
            textView.text=text
            textView.movementMethod= ScrollingMovementMethod()
        }

    }
