package com.example.ehliyetuygulamasi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

class ilkyardim : AppCompatActivity() {
    //@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ilkyardim)
        lateinit var textView: TextView
        textView=findViewById(R.id.textView)
        val text:String="“Ani olarak meydana gelen önceden tahmin edilemeyen,önlenmesi çoğunlukla mümkün olan,ölüm yaralanma ve maddi\n" +
                "hasarla sonuçlanan olay”lara KAZA denir.\n" +
                "Kazalara en çok insanlar, trafik kazalarına da en çok sürücüler sebep olur.Kasıt unsuru olmaksızın insanları ve\n" +
                "çevreyi olumsuz etkileyen doğa olaylarına FELAKET denir.\n" +
                "Trafik kazalarına sebep olan sürücülerin kaza yapmalarındaki en önemli sebepKURALLARA uymamasıdır. Şehir içindeki\n" +
                "kazalardan en çok etkilenenler “ YAŞLILAR veÇOCUKLAR” dır.\n" +
                "İLK YARDIM: Ani olarak hastalan veya kazaya uğrayan kimseye tıbbı tedavisi yapılıncaya kadar çevre imkanlarından da\n" +
                "yararlanılarak yapılan ilk müdahaleye denir.\n" +
                "Buradaki amaç hayat kurtarmaktır.\n" +
                "Kaza yerinde ilk yapılacak önlem trafik güvenliği önlemi almaktır.\n" +
                "Daha sonra :öncelikle KANAMAYI DURDURMAK, daha sonra da solunumu durmuş olanlara yardım edilir.\n" +
                "Trafik kazasında diğer sürücüler her durumda kazazedeye yardım etmek zorundadır. Yardım etmeyenlere para ve puan cezası\n" +
                "verilir.\n" +
                "İNSAN VÜCUDU YAPISI\n" +
                "Vücumuzun en küçük canlı birimi HÜCRE’dir. Hücrenin beslenmesine zar yardımcı olur. Hücreler birleşerek dokuları,\n" +
                "dokular birleşerek ORGAN’ları meydana getirir.\n" +
                "Organlarda birleşerek SİSTEM’leri meydana getirir.\n" +
                "Dolaşım sistemi tüm vücutta faaliyet gösterir. Kalp, dolaşım sisteminin bir parçasıdır ve kanın tüm vücutta dolaşımını sağlar.\n" +
                "Akciğer- gırtlak solunum sistemindedir.\n" +
                "Mide-bağırsak karın bölgesinde ve sindirim sisteminin bir parçasıdır.\n" +
                "Omurga boşluğunda sinir sisteminin bir bölümü faaliyet gösterir.\n" +
                "İLKYARDIM ÇANTASI\n" +
                "İlk yardım çantası motorlu bisiklet,motosiklet ve iş makinası dışındaki tüm motorlu araçlarda bulundurulur.\n" +
                "İlkyardım çantası sürücülerin kolay erişebileceği yerde ve taşınan yolcu sayısına göre malzeme miktarı ayarlanır\n" +
                "İlk yardım çantasında tentürdiyot çıkartılmıştır.\n" +
                "İlk yardım çantasında: TS.4019 a göre Hava yolu hortumu (AIRWAY) ve Üçgen sargı bezi bulunur.\n" +
                "SUNİ SOLUNUM\n" +
                "Solunum durunca ilk etkilenen organ beyindir.4-6 dakika öncesine kadar solunumu duranlara suni solunum\n" +
                "yapılır.yapılmazsa ölüm meydana gelir.En etkili suni solunum ağızdan ağıza yapılandır.İstirahat halindeki yetişkin\n" +
                "insanlarda solunum sayısı 15-20 dir.\n" +
                "Suni solunum solunumu durmuş olanlara sırt üstü yatırılarak yapılır. Çene göğüsten uzaklaştırılır, soluk yolu açılır.\n" +
                "Yetişkinlere dakikada 15-20 kez suni solunum yaptırılmalıdır.Suni solunumda göğüs hareketleri izlenir.\n" +
                "Bebeklerde suni solunum ağız ve burundan az hava sık aralıklarla yapılır.\n" +
                "Suni solunum hasta kendi kendine soluyuncaya kadar devam edilir ve yan yatış pozisyonu verilir.\n" +
                "Beslenme esnasında soluk yoluna yabancı madde kaçan hastaların sırt kısmının ortasına vurularak açılması sağlanır.\n" +
                "Bebeklerde ise baş aşağı gelecek şekilde ayaklardan tutularak sırtına vurulur,soluk yolu açılır.\n" +
                "Solunum yolu ile zehirlenenlere de suni solunum yaptırılır.solunum zorluğu çeken hastalar yan yatırılır, dil kontrol edilir, baş\n" +
                "geriye çekilir.\n" +
                "Holger-Nielsen metodu sırttan bastırma-dirseklerden kaldırma metodunda hasta yüzü koyun yatırılır.Bu yöntem göğüs ve\n" +
                "omurga yaralılarda kullanılmaz. İlk yardımcı hastanın baş kısmı tarafında durarak uygulama yapar.\n" +
                "Silvester Yöntemi : (Göğüsten bastırma.) Hasta sırtüstü yatırılır.İlk yardımcı hastanın baş tarafına diz çöker,hastanın\n" +
                "dirseklerinden tutularak yukarıya ve kendine çekerek suni solunum yaptırır.\n" +
                "Bu metotlar ağız ve burun kanamalı hastalara kullanılır.\n" +
                "KANAMALAR\n" +
                "En tehlikeli kanama atardamar kanamasıdır.Vücut ağırlığının 1/13 ini kan oluşturur.\n" +
                "Kanın %20 kaybedildiğin de hayati tehlike başlar. Atardamar kanamasında kan fışkırır konumda ve açık kırmızı renktedir.\n" +
                "Toplardamar kanaması ise koyu kırmızı ve sızıntı şeklinde olur.\n" +
                "Kanayan yere parmakla basınç uygulanır.\n" +
                "Kendiliğinden meydana gelen burun kanamasında yüz ve ense soğuk su ile yıkanır ve oturuş pozisyonu verilir.\n" +
                "Baş derisi yaralanmalarında şakak kemiği üzerine basınç yapılır.\n" +
                "Omuz bölgesinde ise basınç uygulanacak bölge köprücük kemiği arka iç kısmıdır.\n" +
                "El ve koldaki kanamalarda basınç yapılacak bölge koltuk altıdır.\n" +
                "Ayak ve bacaktaki kanamalarda ise kasık iç kısmına basınç yapılır.\n" +
                "Kanayan yer basınçlı sargı bezi ile sıkıştırılır ve kalp seviyesinden yukarıda tutulur.\n" +
                "TURNİKE (Sıkma bağı ) ile uygulama kanayan damarın turnike malzemesi ile sıkılmasıdır.\n" +
                "El veya koldaki büyük bir kanamada turnike uygulanacak bölge dirsekle omuz arası,\n" +
                "Bacaktaki kanamada ise turnike uygulanacak bölge diz ile kalça arasıdır. Bu uygulama 20 dakika aralıkla 5-10 saniye\n" +
                "gevşetilir.\n" +
                "Turnike malzemesi 5-6 cm. enindeki elastik bandaj malzemelerdir. Kravatta geçici turnike malzemesi olarak kullanılır.\n" +
                "ŞOK ve BAYILMALAR\n" +
                "Aşırı kanama ŞOK’a neden olur.Şoka giren hastada nabız zayıflar,organ ve dokulara kan gitmediği için hayati faaliyetler\n" +
                "azalır.\n" +
                "Şoka giren hastada kanama durdurularak, sırt üstü yatırılıp kafa yana çekilir, ayaklar biraz yukarı kaldırılarak beyne kan\n" +
                "gitmesi sağlanır ve üstü örtülerek sıcak tutulur.\n" +
                "BAYILMA : geçici olarak insanın kendinden geçmesidir, ve bilinç kaybı olur.\n" +
                "Bayılan kişinin dikkatle duyu organları uyarılır. Bayılmada da hasta şok pozisyonuna alınır, kendine gelince yeterince\n" +
                "dinlenmesi sağlanır.\n" +
                "KALP MASAJI\n" +
                "Yetişkin insanlarda kalp atım sayısı 60-80 arası olup bebeklerde bu sayı daha fazladır.\n" +
                "Kalp kanın tüm vücutta dolaşmasını sağlar, kalp durmasının en önemli belirtisi göz bebeklerinin büyümesidir.Kalp\n" +
                "durduğunda nabız hissedilmez,nabız en kolay boyundan hissedilir.\n" +
                "Kalp durduktan en geç 3-5 dak.sonra kalp masajı yapılmalıdır.\n" +
                "Kalp masajı yapılacak hasta sırt üstü sert bir zemine yatırılarak, göğüs kemiğinin alt uç 1/3 lük kısmına göğüs kemiği 5-7 cm.\n" +
                "kadar esnetecek şekilde ve dakikada 60-80 kez tekrarlanır. Bebeklerde ise dak.100 kez denenir.\n" +
                "Bu işleme en fazla 5 dak.devam edilir.Kalbi çalışan bir hastaya kesinlikle kalp masajı yapılmaz.\n" +
                "İki ilk yardımcının bulunduğu ortamda kalp masajı ve Suni solunum beraber yapılacaksa 5 kalp masajı-1 suni solunum ama\n" +
                "tek ilk yardımcı bu işlemi yapacaksa : 15 kalp masajı-2 suni solunum olacak şekilde ilk yardım yapılır.\n" +
                "Elektrik çarpmalarında ise kazazede elektrik devresinden kurtarıldıktan sonra kalp masajı yapılacak bölgeye yumrukla bir\n" +
                "defa vurularak kalp uyarılır.\n" +
                "YARALANMALAR\n" +
                "BAŞ yaralanmalarında hastada bulantı ve kusma görülebilir.\n" +
                "Göz bebeklerinde büyüklük fark vardır.Kanayan yer aşağı gelecek şekilde baş soğuk ama vücut sıcak tutulur. Soluk yolu\n" +
                "açılarak en az 6 saat doktor gözetiminde tutulması gerekir.\n" +
                "GÖĞÜS yaralanmalarında, akciğerlerin hava almaması için elle veya ıslak bezle kapatılır. Yabancı cisim varsa\n" +
                "çıkartılmaz.Hasta oturuş veya yarı oturuş pozisyonunda sevk edilir.\n" +
                "KARIN yaralanmalarında bu bölgede iç kanamadan dolayı sertlik görülür, hastaya sulu gıda verilmez, buz tatbik edilir.\n" +
                "Hastaya verilecek pozisyon : yara yukarıdan aşağıya göre ise ayaklar birleştirilip sevk edilir.\n" +
                "Yara Enine göre ise diz bükülerek sevk edilir. Dışarı çıkan organ varsa yerine yerleştirilir.\n" +
                "OMURGA yaralanması veya kırıklarında hastada yara bölgesinin alt kısımlarında duyu kaybı vardır.Hastaya sırt üstü düz\n" +
                "yatış pozisyonu verilir.Dikkatli taşınmaz ise hasta felç olabilir.\n" +
                "Trafik kazalarında en çok sert ve künt cisimlerin batması ile meydana gelen ezik ve kesik yaralar görülür.\n" +
                "Temiz sargı bezi ile yara dış etkenlerden korunur. Yara kalp seviyesinden yukarıda kesik kısımlar birbirine yaklaştırılarak\n" +
                "yabancı madde batmışsa çıkartılmadan sevk edilir.\n" +
                "Araç çalışıyorsa yangın çıkmaması için hemen stop edilir.\n" +
                "YANIKLAR İlk yardıma ihtiyaç olamayan tek yanık güneş yanığıdır. En ağır yanık 3,derece yanıklardır.\n" +
                "Yanıklara buz tatbik edilir kesinlikle su toplanması (Bül) patlatılmaz. Islak bezle soğutulur.\n" +
                "Yanıklarda tehlike sınırı %20 dir. Kimyasal madde yanıklarında yara yeri bol su ile yıkanır.\n" +
                "Yangın söndürme tüpü sürücünün hemen yanında ve (A1-,A2, F) sınıfı sürücü belgesi ile kullanılan araçların dışındaki tüm\n" +
                "motorlu araçlarda bulun durulmak zorundadır.\n" +
                "Yangın durumunda kaput açılmadan motorun önünden ve altından sıkılarak kullanılır\n" +
                "DOKU ve ORGAN BAĞIŞI : Ülkemizde kan’dan sonra en çok bağışlanan organböbrektir.Doku ve organ bağışı hem dinen\n" +
                "hem hukuken uygundur.\n" +
                "KIRIKLAR\n" +
                "Herhangi bir nedenle kemik dokusunun bozulmasına kırk denir. Kırıklar ATELmalzemeleri ile sabitleştirilir.\n" +
                "Atel ile sabitleştirilmeyen kırklar iç kanamaya veya felçlere neden olabilir.\n" +
                "Atel ; kol ve bacak kırıklarında uygulanır.\n" +
                "Köprücük kemiği kırıklarında omuz üçgen sargı bezi ile göğüse bağlanıp oturuş pozisyonunda sevk edilir.\n" +
                "Ön kol kemiği kırıklarında atel tahtası,üçgen sargı bezi ile sabitlenen kol vücuda 90 derece olacak şekilde asılır.\n" +
                "Aynı görevi ceket veya gömlek eteği kol üzerinden kıvrılarak kırık kol asılır.oturuş pozisyonunda sevk edilir.\n" +
                "Bacak kırıklarında kırık diz ile kalça arasında ise atel boyu topuk ile koltuk altınakadarDiz ile topuk arasında ise atel topuk ile kalça arasına kadar olmalıdır.\n" +
                "Atel malzemesi olmadığında iki bacak arasına yumuşak malzeme konularak birbirine bağlanır.\n" +
                "Hasta yatar konumda sevk edilir.Kaburga kırıklarında oturuş-yarı oturuş pozisyonunda taşınır.\n" +
                "BURKULMALAR\n" +
                "Burkulma hareketli eklem bağlarının zedelenmesidir.\n" +
                "Burkulan bölge kalp seviyesinden yukarı ve 12 saat soğuk daha sonra sıcak tutulur.\n" +
                "ÇIKIKLAR\n" +
                "Çıkıklar hareketli eklem yüzeylerinin birbirinden ayrılmasıdır.Çıkık bölge soğuk ve hareketsizliği sağlanarak ve vücut sıcak\n" +
                "tutulması için üzerine bir örtü kapatılarak doktora sevk edilir.\n" +
                "HABERLEŞME: Hızır acil servis telefonu :112 dir.Kaza olduğu bildirilirken : Yaralıların ölmesini önleyecek tedbirler\n" +
                "alındıktan sonra yaralı sayısı ve durumu,kısa öz anlaşılır şekilde bildirilir.\n" +
                "YARALILARIN TAŞINMASI\n" +
                "Kaza yerinden ilk taşınacaklar: Şoka girmekte olanlar, solunum zorluğu çekenler,kanaması olanlar,göğüs yarası olanlar,\n" +
                "geniş yanıkları olanlar (%20-40), Açık karı yaralı olanlar, gaz zehirlenmeli,ezik ve kırıklı olanlar.\n" +
                "İkinci derecede taşınacaklar : Turnike uygulananlar, iç kanamalılar, Donanlar, Bilinci yerinde olmayanlar.\n" +
                "Üçüncü derecede taşınacaklar :Omurga kırığı veya omurilik yaralanması, %40 dan fazla yanıklı olanlar,ağır\n" +
                "Beyin yarası olanlar, çok fazla kırığı olanlar, çok fazla kanaması olanlar.\n" +
                "Dördüncü derecede taşınacaklar:Basit yarası olanlar, küçük yanıklı olanlar, Burkulma ve çıkığı olanlar ve Ölüler.\n" +
                "YAN YATIŞ : Zor solunum yapanlar, kusanlar, zehirlenenler, beyin kanaması olup, kulağından kan gelenler\n" +
                "OTURUŞ : Baş yaralanması, köprücük-kol ön kol kırıkları olanlar.\n" +
                "OTURUŞ-YARI OTURUŞ : Kaburga kırıkları, göğüs yaralanması olanlar,\n" +
                "SIRT ÜSTÜ : Bacak kemiği kırıklı, omurga kırıklarında\n" +
                "ŞOK POZİSYONU : Şoka girenler ve bayılanlar.\n" +
                "Araçta yangın çıkmışsa yaralı araçtan bir kişi ile çıkartılmak zorundadır.\n" +
                "Normal şartlarda yaralı araçtan üç kişi ile çıkartılmalıdır.\n" +
                "Yaralılar araçtan çıkartılırken omurga ekseni düzgünlüğüne dikkat etmek zorundadır.\n" +
                "Boyun yaralanmasında mutlaka boyunluk ( KASK) veya boyun kalın malzeme ile sarılarak sabitlenir.\n" +
                "Yaralıların taşınmasında en çok tercih edilmesi gerekli durum SEDYE ile taşıma olmalıdır.\n" +
                "Sedye ile taşımada hastanın AYAK tarafı hep önde olacak şekilde taşınır.\n" +
                "Merdivenden indirirken ve çıkartırken baş yukarıda olmalıdır.\n" +
                "ZEHİRLENMELER\n" +
                "Egzost gazı, karbon monoksit zehirlenmesi ile kapalı bir mekanda veya garajda uzun süre egzost gazın solunması ile\n" +
                "meydana gelir.Bu hastalar açık havaya çıkarılarak gerekiyorsa suni solunum yaptırılır.\n" +
                "İlaçla zehirlenenler hemen kusturulur. Asit-baz zehirlenmelerinde bol su içirilir.\n" +
                "Yoğurt zehirlenmede yararsızdır\n" +
                "Kusturmada en etkili yöntem parmakla dilin arka kısmını uyarmaktır.\n" +
                "Yılan akrep sokmasında, sokulan yer kalp seviyesinden aşağıda tutulmalıdır.\n" +
                "Arı sokmasında bölgeye amonyak sürülür.\n" +
                "GÜNEŞ ÇARPMASI : Vücut sıcaklığının artmasından dolayı vücut sıcaklığı düşürülür,en çok etkilenen organ beyindir.\n" +
                "Sıcak çarpmasında aşırı terleme ve tuz kaybı olduğundan tuzlu ayran verilir.\n" +
                "DONMALAR :Donmaya maruz kalan kişilerde uyku hali görüleceğinde uyuması engellenerek vücut sıcaklığı yavaş yavaş\n" +
                "yükseltilir, şekerli içecekler verilir.Hiçbir şekilde sert ve hızlı masaj yapılmaz, alkol içirilmez\n" +
                "Gözlükle veya lensle araç kullanan sürücüler araç kullanırken bunları takmak zorundadır.\n" +
                "İşitme cihazı ile araç kullanacaklara B sınıfı özel ve F sınıfı sürücü belgesi verilir.\n" +
                "Tek eli olmayanlara H sınıfı dahil hiçbir sürücü belgesi verilmez.\n" +
                "Ortopedik özürlü adaylar ancak H sınıfı belge alabilir.\n" +
                "Ticari ve resmi araç sürücüleri alkollü araç kullanamazlar.\n" +
                "Özel araç sürücüler için ölçü %50 promildir.\n" +
                "Alkol ve uyuşturucu bağımlılığı ileri derecede olanlara sürücü belgesi verilmez.\n" +
                "Emniyet kemeri şehir içinde ve dışında takılması zorunludur.\n" +
                "Motosiklet kullananlar koruyucu başlık ve gözlük kullanmak zorundadır\n" +
                "Sürücülükte ruhi denge çok önemli olup, araç kullanırken kurallara uymak,saygılı olmak,paylaşmayı bilmek tüm trafikte\n" +
                "olanlara sağlıklı ve rahat ulaşım sağlayacaktır."
        textView.text=text
        textView.movementMethod= ScrollingMovementMethod()
    }
}