package com.grijesh.project.euler.problem13

import com.grijesh.project.euler.Utility

import scala.collection.mutable.ArrayBuffer

/**
 * Created by grijesh on 22/11/15.
 */
object EulerProblem13 extends App {

  var givenNumbers = ArrayBuffer[String]()

  givenNumbers += "37107287533902102798797998220837590246510135740250"
  givenNumbers += "46376937677490009712648124896970078050417018260538"
  givenNumbers += "74324986199524741059474233309513058123726617309629"
  givenNumbers += "91942213363574161572522430563301811072406154908250"
  givenNumbers += "23067588207539346171171980310421047513778063246676"
  givenNumbers += "89261670696623633820136378418383684178734361726757"
  givenNumbers += "28112879812849979408065481931592621691275889832738"
  givenNumbers += "44274228917432520321923589422876796487670272189318"
  givenNumbers += "47451445736001306439091167216856844588711603153276"
  givenNumbers += "70386486105843025439939619828917593665686757934951"
  givenNumbers += "62176457141856560629502157223196586755079324193331"
  givenNumbers += "64906352462741904929101432445813822663347944758178"
  givenNumbers += "92575867718337217661963751590579239728245598838407"
  givenNumbers += "58203565325359399008402633568948830189458628227828"
  givenNumbers += "80181199384826282014278194139940567587151170094390"
  givenNumbers += "35398664372827112653829987240784473053190104293586"
  givenNumbers += "86515506006295864861532075273371959191420517255829"
  givenNumbers += "71693888707715466499115593487603532921714970056938"
  givenNumbers += "54370070576826684624621495650076471787294438377604"
  givenNumbers += "53282654108756828443191190634694037855217779295145"
  givenNumbers += "36123272525000296071075082563815656710885258350721"
  givenNumbers += "45876576172410976447339110607218265236877223636045"
  givenNumbers += "17423706905851860660448207621209813287860733969412"
  givenNumbers += "81142660418086830619328460811191061556940512689692"
  givenNumbers += "51934325451728388641918047049293215058642563049483"
  givenNumbers += "62467221648435076201727918039944693004732956340691"
  givenNumbers += "15732444386908125794514089057706229429197107928209"
  givenNumbers += "55037687525678773091862540744969844508330393682126"
  givenNumbers += "18336384825330154686196124348767681297534375946515"
  givenNumbers += "80386287592878490201521685554828717201219257766954"
  givenNumbers += "78182833757993103614740356856449095527097864797581"
  givenNumbers += "16726320100436897842553539920931837441497806860984"
  givenNumbers += "48403098129077791799088218795327364475675590848030"
  givenNumbers += "87086987551392711854517078544161852424320693150332"
  givenNumbers += "59959406895756536782107074926966537676326235447210"
  givenNumbers += "69793950679652694742597709739166693763042633987085"
  givenNumbers += "41052684708299085211399427365734116182760315001271"
  givenNumbers += "65378607361501080857009149939512557028198746004375"
  givenNumbers += "35829035317434717326932123578154982629742552737307"
  givenNumbers += "94953759765105305946966067683156574377167401875275"
  givenNumbers += "88902802571733229619176668713819931811048770190271"
  givenNumbers += "25267680276078003013678680992525463401061632866526"
  givenNumbers += "36270218540497705585629946580636237993140746255962"
  givenNumbers += "24074486908231174977792365466257246923322810917141"
  givenNumbers += "91430288197103288597806669760892938638285025333403"
  givenNumbers += "34413065578016127815921815005561868836468420090470"
  givenNumbers += "23053081172816430487623791969842487255036638784583"
  givenNumbers += "11487696932154902810424020138335124462181441773470"
  givenNumbers += "63783299490636259666498587618221225225512486764533"
  givenNumbers += "67720186971698544312419572409913959008952310058822"
  givenNumbers += "95548255300263520781532296796249481641953868218774"
  givenNumbers += "76085327132285723110424803456124867697064507995236"
  givenNumbers += "37774242535411291684276865538926205024910326572967"
  givenNumbers += "23701913275725675285653248258265463092207058596522"
  givenNumbers += "29798860272258331913126375147341994889534765745501"
  givenNumbers += "18495701454879288984856827726077713721403798879715"
  givenNumbers += "38298203783031473527721580348144513491373226651381"
  givenNumbers += "34829543829199918180278916522431027392251122869539"
  givenNumbers += "40957953066405232632538044100059654939159879593635"
  givenNumbers += "29746152185502371307642255121183693803580388584903"
  givenNumbers += "41698116222072977186158236678424689157993532961922"
  givenNumbers += "62467957194401269043877107275048102390895523597457"
  givenNumbers += "23189706772547915061505504953922979530901129967519"
  givenNumbers += "86188088225875314529584099251203829009407770775672"
  givenNumbers += "11306739708304724483816533873502340845647058077308"
  givenNumbers += "82959174767140363198008187129011875491310547126581"
  givenNumbers += "97623331044818386269515456334926366572897563400500"
  givenNumbers += "42846280183517070527831839425882145521227251250327"
  givenNumbers += "55121603546981200581762165212827652751691296897789"
  givenNumbers += "32238195734329339946437501907836945765883352399886"
  givenNumbers += "75506164965184775180738168837861091527357929701337"
  givenNumbers += "62177842752192623401942399639168044983993173312731"
  givenNumbers += "32924185707147349566916674687634660915035914677504"
  givenNumbers += "99518671430235219628894890102423325116913619626622"
  givenNumbers += "73267460800591547471830798392868535206946944540724"
  givenNumbers += "76841822524674417161514036427982273348055556214818"
  givenNumbers += "97142617910342598647204516893989422179826088076852"
  givenNumbers += "87783646182799346313767754307809363333018982642090"
  givenNumbers += "10848802521674670883215120185883543223812876952786"
  givenNumbers += "71329612474782464538636993009049310363619763878039"
  givenNumbers += "62184073572399794223406235393808339651327408011116"
  givenNumbers += "66627891981488087797941876876144230030984490851411"
  givenNumbers += "60661826293682836764744779239180335110989069790714"
  givenNumbers += "85786944089552990653640447425576083659976645795096"
  givenNumbers += "66024396409905389607120198219976047599490197230297"
  givenNumbers += "64913982680032973156037120041377903785566085089252"
  givenNumbers += "16730939319872750275468906903707539413042652315011"
  givenNumbers += "94809377245048795150954100921645863754710598436791"
  givenNumbers += "78639167021187492431995700641917969777599028300699"
  givenNumbers += "15368713711936614952811305876380278410754449733078"
  givenNumbers += "40789923115535562561142322423255033685442488917353"
  givenNumbers += "44889911501440648020369068063960672322193204149535"
  givenNumbers += "41503128880339536053299340368006977710650566631954"
  givenNumbers += "81234880673210146739058568557934581403627822703280"
  givenNumbers += "82616570773948327592232845941706525094512325230608"
  givenNumbers += "22918802058777319719839450180888072429661980811197"
  givenNumbers += "77158542502016545090413245809786882778948721859617"
  givenNumbers += "72107838435069186155435662884062257473692284509516"
  givenNumbers += "20849603980134001723930671666823555245252804609722"
  givenNumbers += "53503534226472524250874054075591789781264330331690"

  println(Utility.time(givenNumbers.iterator.map(BigInt(_)).sum.toString().take(10)))
  /* var sum:BigInt =0
   givenNumbers.foreach(sum += BigInt(_))
   println(sum.toString().take(10))*/

}
