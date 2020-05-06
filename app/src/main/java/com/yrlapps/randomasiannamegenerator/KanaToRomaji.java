package com.yrlapps.randomasiannamegenerator;

///////ALL OF THIS IS REFERENCED FROM THE JAKAROMA PROJECT BY NICOLAS RAOUL
import java.util.HashMap;
import java.util.Map;
public class KanaToRomaji {
    Map<String, String> m = new HashMap<String, String>();

    // Constructor
    public KanaToRomaji() {
        m.put("あ", "a");
        m.put("い", "i");
        m.put("う", "u");
        m.put("え", "e");
        m.put("お", "o");
        m.put("か", "ka");
        m.put("き", "ki");
        m.put("く", "ku");
        m.put("け", "ke");
        m.put("こ", "ko");
        m.put("さ", "sa");
        m.put("し", "shi");
        m.put("す", "su");
        m.put("せ", "se");
        m.put("そ", "so");
        m.put("た", "ta");
        m.put("ち", "chi");
        m.put("つ", "tsu");
        m.put("て", "te");
        m.put("と", "to");
        m.put("な", "na");
        m.put("に", "ni");
        m.put("ぬ", "nu");
        m.put("ね", "ne");
        m.put("の", "no");
        m.put("は", "ha");
        m.put("ひ", "hi");
        m.put("ふ", "fu");
        m.put("へ", "he");
        m.put("ほ", "ho");
        m.put("ま", "ma");
        m.put("み", "mi");
        m.put("む", "mu");
        m.put("め", "me");
        m.put("も", "mo");
        m.put("や", "ya");
        m.put("ゆ", "yu");
        m.put("よ", "yo");
        m.put("ら", "ra");
        m.put("り", "ri");
        m.put("る", "ru");
        m.put("れ", "re");
        m.put("ろ", "ro");
        m.put("わ", "wa");
        m.put("を", "wo");
        m.put("ん", "n");
        m.put("が", "ga");
        m.put("ぎ", "gi");
        m.put("ぐ", "gu");
        m.put("げ", "ge");
        m.put("ご", "go");
        m.put("ざ", "za");
        m.put("じ", "ji");
        m.put("ず", "zu");
        m.put("ぜ", "ze");
        m.put("ぞ", "zo");
        m.put("だ", "da");
        m.put("ぢ", "ji");
        m.put("づ", "zu");
        m.put("で", "de");
        m.put("ど", "do");
        m.put("ば", "ba");
        m.put("び", "bi");
        m.put("ぶ", "bu");
        m.put("べ", "be");
        m.put("ぼ", "bo");
        m.put("ぱ", "pa");
        m.put("ぴ", "pi");
        m.put("ぷ", "pu");
        m.put("ぺ", "pe");
        m.put("ぽ", "po");
        m.put("きゃ", "kya");
        m.put("きゅ", "kyu");
        m.put("きょ", "kyo");
        m.put("しゃ", "sha");
        m.put("しゅ", "shu");
        m.put("しょ", "sho");
        m.put("ちゃ", "cha");
        m.put("ちゅ", "chu");
        m.put("ちょ", "cho");
        m.put("にゃ", "nya");
        m.put("にゅ", "nyu");
        m.put("にょ", "nyo");
        m.put("ひゃ", "hya");
        m.put("ひゅ", "hyu");
        m.put("ひょ", "hyo");
        m.put("りゃ", "rya");
        m.put("りゅ", "ryu");
        m.put("りょ", "ryo");
        m.put("ぎゃ", "gya");
        m.put("ぎゅ", "gyu");
        m.put("ぎょ", "gyo");
        m.put("じゃ", "ja");
        m.put("じゅ", "ju");
        m.put("じょ", "jo");
        m.put("てぃ", "ti");
        m.put("でぃ", "di");
        m.put("つぃ", "tsi");
        m.put("ぢゃ", "dya");
        m.put("ぢゅ", "dyu");
        m.put("ぢょ", "dyo");
        m.put("びゃ", "bya");
        m.put("びゅ", "byu");
        m.put("びょ", "byo");
        m.put("ぴゃ", "pya");
        m.put("ぴゅ", "pyu");
        m.put("ぴょ", "pyo");
        m.put("ー", "-");
    }
    public String convert(String s) {
        StringBuilder t = new StringBuilder();
        for ( int i = 0; i < s.length(); i++ ) {
            if ( i <= s.length() - 2 )  {
                if ( m.containsKey(s.substring(i,i+2))) {
                    t.append(m.get(s.substring(i, i+2)));
                    i++;
                } else if (m.containsKey(s.substring(i, i+1))) {
                    t.append(m.get(s.substring(i, i+1)));
                } else if ( s.charAt(i) == 'ッ' ) {
                    t.append(m.get(s.substring(i+1, i+2)).charAt(0));
                } else {
                    t.append(s.charAt(i));
                }
            } else {
                if (m.containsKey(s.substring(i, i+1))) {
                    t.append(m.get(s.substring(i, i+1)));
                } else {
                    t.append(s.charAt(i));
                }
            }
        }
        return t.toString();
    }}