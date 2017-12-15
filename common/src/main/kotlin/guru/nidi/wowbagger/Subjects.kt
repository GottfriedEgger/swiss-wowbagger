package guru.nidi.wowbagger
import guru.nidi.wowbagger.Wowbagger.trimLines

object Subjects {
    val list = """
m Aargouer Outofahrer
m Aff
m Arschchäfer
m Arschgigu
n Arschkantefilet
m Aschi
n Aupechaub
f Baabe
m Bisibueb
m Bisitrinker
m Blickläser
m Blöffsack
n Bohneross
m Bschishung
f Bärgänte
m Bäse
m Bääggisiech
f Bire
m Birewixer
m Büffu
m Bünzli
m Bürokolleg
m Chafler
m Chaflicheib
m Cheib
f Chleechue
m Chnorzi
m Chotzchübu
m Chouderi
m Chrüppucheib
m Chrüppuhung
n Chuderluuri
n Chuefüdle
m Chutzemischt
m Dräcksack
m Figgfähler
m Frässhung
m Fuschti
m Futz
m Futzbuur
f Färlimore
m Fötzu
m Fötzucheib
m Fötzusiech
m Galööri
m Gartefeschtplouderi
f Gibe
m Gigu
m Gigusiech
m Globivogu
m Glögglifrösch
m Glünggi
m Gnieti
m Gorilla Blauarsch
m Groggermooslaferi
m Gränni
m Grüsu
m Gschtabi
m Gschtabicheib
m Gummihaus
f Gumsle
m Gäderhächu
n Gäderiwyb
n Gäderimanndli
n Güezi
m Haagge
n Haaghuuri
m Habasch
f Hafehuer
m Hagu
m Heilandtonner
m Hornochs
m Hudilump
f Hundsniere
m Hueresiech
m Höseler
m Höuzu
m Im-Kreisu-Links-Blinker
m Krouteri
n Kamuff
m Laferi
m Lafericheib
m Laferisiech
m Laggaff
m Lappi
m Lauerisiech
m Lumpehung
m Lyribänz
m Lümu
f Memme
n Miuchmubi
m Mongo
m Mongobilly
f Moore
m Motzi
m Mulaff
m Muggigring
m Möngu
m Möff
m Mürggu
m Nasepööggu
m Närvsack
m Pajass
f Panne
m Plouderi
m Pflock
m Pflotsch
m Pfoschte
m Pralaaggi
m Praschaueri
f Pumpi
m Püntu
m Püüru
m Quadratspüntu
n Rääf
f Rosshode
m Rosspigger
n Rybise
f Schabe
m Schafsecku
m Schiissigurgler
m Schiissiputzer
m Schissgring
m Schlimschisser
m Schminggu
m Schnuddergoof
m Schnudderi
m Schnäbizägg
m Schnäbichätscher
m Schnäbischpienzler
f Schnädere
m Schwanzlurch
m Schwüppu
m Schöggeler
m Secku
m Seckupeter
m Siech
m Solothurner
m Soucheib
m Souhung
f Soumoore
m Sousiech
m Spränzu
m Stürmi
m Stärnesiech
m Stürmisiech
m Söiniggu
m Süchu
m Süffu
m Sürmu
n Theresli
m Toggu
m Totsch
m Traliwatsch
m Troschtpris
f Träne
m Tröunagu
m Tschirpegigu
m Tschumppuhung
m Tschumpu
m Tubu
n Tussi
m Töfflibueb
m Tüpflischisser
m Uhung
m Vagant
m Voupfoschte
m Voutotsch
m Weichschnäbeler
f Wixbire
f Wurzle
m Wäbstübeler
m Ziegu
m Zirpegigu
m Zwick
m Zwänggring
f Zwätschge
m Zäieföhner
m Zürcher
f auti Hafehuer
m genetische Müuhuufe
m Äschebächer
m Ätti mit Huet
""".trimLines().map { Gendered(it) }
}