//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.22 at 04:21:20 PM EEST 
//


package com.cv.model.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motherCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="motherCode">
 *   &lt;restriction base="{http://europass.cedefop.europa.eu/Europass}foreignCode">
 *     &lt;enumeration value="bg"/>
 *     &lt;enumeration value="cs"/>
 *     &lt;enumeration value="da"/>
 *     &lt;enumeration value="nl"/>
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="et"/>
 *     &lt;enumeration value="fi"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="el"/>
 *     &lt;enumeration value="hu"/>
 *     &lt;enumeration value="is"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="lv"/>
 *     &lt;enumeration value="lt"/>
 *     &lt;enumeration value="mt"/>
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="pl"/>
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="ro"/>
 *     &lt;enumeration value="hr"/>
 *     &lt;enumeration value="sk"/>
 *     &lt;enumeration value="sl"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="sv"/>
 *     &lt;enumeration value="tr"/>
 *     &lt;enumeration value="ab"/>
 *     &lt;enumeration value="af"/>
 *     &lt;enumeration value="sq"/>
 *     &lt;enumeration value="am"/>
 *     &lt;enumeration value="ar"/>
 *     &lt;enumeration value="an"/>
 *     &lt;enumeration value="hy"/>
 *     &lt;enumeration value="as"/>
 *     &lt;enumeration value="az"/>
 *     &lt;enumeration value="eu"/>
 *     &lt;enumeration value="be"/>
 *     &lt;enumeration value="bn"/>
 *     &lt;enumeration value="bs"/>
 *     &lt;enumeration value="br"/>
 *     &lt;enumeration value="my"/>
 *     &lt;enumeration value="ca"/>
 *     &lt;enumeration value="ce"/>
 *     &lt;enumeration value="zh"/>
 *     &lt;enumeration value="kw"/>
 *     &lt;enumeration value="co"/>
 *     &lt;enumeration value="fo"/>
 *     &lt;enumeration value="fj"/>
 *     &lt;enumeration value="fy"/>
 *     &lt;enumeration value="ka"/>
 *     &lt;enumeration value="gd"/>
 *     &lt;enumeration value="ga"/>
 *     &lt;enumeration value="gl"/>
 *     &lt;enumeration value="gv"/>
 *     &lt;enumeration value="gu"/>
 *     &lt;enumeration value="ht"/>
 *     &lt;enumeration value="he"/>
 *     &lt;enumeration value="hi"/>
 *     &lt;enumeration value="id"/>
 *     &lt;enumeration value="jv"/>
 *     &lt;enumeration value="ja"/>
 *     &lt;enumeration value="kn"/>
 *     &lt;enumeration value="kk"/>
 *     &lt;enumeration value="ky"/>
 *     &lt;enumeration value="kg"/>
 *     &lt;enumeration value="ko"/>
 *     &lt;enumeration value="ku"/>
 *     &lt;enumeration value="lo"/>
 *     &lt;enumeration value="li"/>
 *     &lt;enumeration value="ln"/>
 *     &lt;enumeration value="lb"/>
 *     &lt;enumeration value="mk"/>
 *     &lt;enumeration value="ml"/>
 *     &lt;enumeration value="mr"/>
 *     &lt;enumeration value="ms"/>
 *     &lt;enumeration value="mg"/>
 *     &lt;enumeration value="mo"/>
 *     &lt;enumeration value="mn"/>
 *     &lt;enumeration value="ne"/>
 *     &lt;enumeration value="nn"/>
 *     &lt;enumeration value="nb"/>
 *     &lt;enumeration value="pa"/>
 *     &lt;enumeration value="fa"/>
 *     &lt;enumeration value="ps"/>
 *     &lt;enumeration value="rm"/>
 *     &lt;enumeration value="rom"/>
 *     &lt;enumeration value="ru"/>
 *     &lt;enumeration value="sr"/>
 *     &lt;enumeration value="se"/>
 *     &lt;enumeration value="sd"/>
 *     &lt;enumeration value="so"/>
 *     &lt;enumeration value="sc"/>
 *     &lt;enumeration value="sw"/>
 *     &lt;enumeration value="ty"/>
 *     &lt;enumeration value="ta"/>
 *     &lt;enumeration value="tt"/>
 *     &lt;enumeration value="te"/>
 *     &lt;enumeration value="tg"/>
 *     &lt;enumeration value="tl"/>
 *     &lt;enumeration value="th"/>
 *     &lt;enumeration value="bo"/>
 *     &lt;enumeration value="tk"/>
 *     &lt;enumeration value="uk"/>
 *     &lt;enumeration value="ur"/>
 *     &lt;enumeration value="uz"/>
 *     &lt;enumeration value="vi"/>
 *     &lt;enumeration value="cy"/>
 *     &lt;enumeration value="yi"/>
 *     &lt;enumeration value="yo"/>
 *     &lt;enumeration value="km"/>
 *     &lt;enumeration value="asq"/>
 *     &lt;enumeration value="sqk"/>
 *     &lt;enumeration value="bos-sgn"/>
 *     &lt;enumeration value="bfi"/>
 *     &lt;enumeration value="bqn"/>
 *     &lt;enumeration value="csc"/>
 *     &lt;enumeration value="csq"/>
 *     &lt;enumeration value="cy-sgn"/>
 *     &lt;enumeration value="cse"/>
 *     &lt;enumeration value="dsl"/>
 *     &lt;enumeration value="dse"/>
 *     &lt;enumeration value="eso"/>
 *     &lt;enumeration value="fse"/>
 *     &lt;enumeration value="vgt"/>
 *     &lt;enumeration value="sfb"/>
 *     &lt;enumeration value="fsl"/>
 *     &lt;enumeration value="gsg"/>
 *     &lt;enumeration value="gss"/>
 *     &lt;enumeration value="hsh"/>
 *     &lt;enumeration value="icl"/>
 *     &lt;enumeration value="isg"/>
 *     &lt;enumeration value="ise"/>
 *     &lt;enumeration value="xk-sgn"/>
 *     &lt;enumeration value="lsl"/>
 *     &lt;enumeration value="lls"/>
 *     &lt;enumeration value="mk-sgn"/>
 *     &lt;enumeration value="mdl"/>
 *     &lt;enumeration value="me-sgn"/>
 *     &lt;enumeration value="nsl"/>
 *     &lt;enumeration value="pso"/>
 *     &lt;enumeration value="psr"/>
 *     &lt;enumeration value="rms"/>
 *     &lt;enumeration value="srp-sgn"/>
 *     &lt;enumeration value="svk"/>
 *     &lt;enumeration value="slv-sgn"/>
 *     &lt;enumeration value="ssp"/>
 *     &lt;enumeration value="swl-sgn"/>
 *     &lt;enumeration value="ssr"/>
 *     &lt;enumeration value="sgg"/>
 *     &lt;enumeration value="slf"/>
 *     &lt;enumeration value="tsm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "motherCode")
@XmlEnum(ForeignCode.class)
public enum MotherCode {


    /**
     * bulgarca
     * 
     */
    @XmlEnumValue("bg")
    BG(ForeignCode.BG),

    /**
     * \u00e7ek\u00e7e
     * 
     */
    @XmlEnumValue("cs")
    CS(ForeignCode.CS),

    /**
     * danca
     * 
     */
    @XmlEnumValue("da")
    DA(ForeignCode.DA),

    /**
     * flemenk\u00e7e
     * 
     */
    @XmlEnumValue("nl")
    NL(ForeignCode.NL),

    /**
     * ingilizce
     * 
     */
    @XmlEnumValue("en")
    EN(ForeignCode.EN),

    /**
     * estonca
     * 
     */
    @XmlEnumValue("et")
    ET(ForeignCode.ET),

    /**
     * fince
     * 
     */
    @XmlEnumValue("fi")
    FI(ForeignCode.FI),

    /**
     * frans\u0131zca
     * 
     */
    @XmlEnumValue("fr")
    FR(ForeignCode.FR),

    /**
     * almanca
     * 
     */
    @XmlEnumValue("de")
    DE(ForeignCode.DE),

    /**
     * yunanca
     * 
     */
    @XmlEnumValue("el")
    EL(ForeignCode.EL),

    /**
     * macarca
     * 
     */
    @XmlEnumValue("hu")
    HU(ForeignCode.HU),

    /**
     * izlandaca
     * 
     */
    @XmlEnumValue("is")
    IS(ForeignCode.IS),

    /**
     * italyanca
     * 
     */
    @XmlEnumValue("it")
    IT(ForeignCode.IT),

    /**
     * letonca
     * 
     */
    @XmlEnumValue("lv")
    LV(ForeignCode.LV),

    /**
     * litvanca
     * 
     */
    @XmlEnumValue("lt")
    LT(ForeignCode.LT),

    /**
     * maltaca
     * 
     */
    @XmlEnumValue("mt")
    MT(ForeignCode.MT),

    /**
     * norve\u00e7\u00e7e
     * 
     */
    @XmlEnumValue("no")
    NO(ForeignCode.NO),

    /**
     * leh\u00e7e
     * 
     */
    @XmlEnumValue("pl")
    PL(ForeignCode.PL),

    /**
     * portekizce
     * 
     */
    @XmlEnumValue("pt")
    PT(ForeignCode.PT),

    /**
     * rumence
     * 
     */
    @XmlEnumValue("ro")
    RO(ForeignCode.RO),

    /**
     * h\u0131rvat\u00e7a
     * 
     */
    @XmlEnumValue("hr")
    HR(ForeignCode.HR),

    /**
     * slovak\u00e7a
     * 
     */
    @XmlEnumValue("sk")
    SK(ForeignCode.SK),

    /**
     * slovence
     * 
     */
    @XmlEnumValue("sl")
    SL(ForeignCode.SL),

    /**
     * ispanyolca
     * 
     */
    @XmlEnumValue("es")
    ES(ForeignCode.ES),

    /**
     * isve\u00e7\u00e7e
     * 
     */
    @XmlEnumValue("sv")
    SV(ForeignCode.SV),

    /**
     * t\u00fcrk\u00e7e
     * 
     */
    @XmlEnumValue("tr")
    TR(ForeignCode.TR),

    /**
     * abhazca
     * 
     */
    @XmlEnumValue("ab")
    AB(ForeignCode.AB),

    /**
     * afrikanca
     * 
     */
    @XmlEnumValue("af")
    AF(ForeignCode.AF),

    /**
     * arnavut\u00e7a
     * 
     */
    @XmlEnumValue("sq")
    SQ(ForeignCode.SQ),

    /**
     * amharca
     * 
     */
    @XmlEnumValue("am")
    AM(ForeignCode.AM),

    /**
     * arap\u00e7a
     * 
     */
    @XmlEnumValue("ar")
    AR(ForeignCode.AR),

    /**
     * aragonca
     * 
     */
    @XmlEnumValue("an")
    AN(ForeignCode.AN),

    /**
     * ermenice 
     * 
     */
    @XmlEnumValue("hy")
    HY(ForeignCode.HY),

    /**
     * assamca
     * 
     */
    @XmlEnumValue("as")
    AS(ForeignCode.AS),

    /**
     * azerice
     * 
     */
    @XmlEnumValue("az")
    AZ(ForeignCode.AZ),

    /**
     * bask\u00e7a
     * 
     */
    @XmlEnumValue("eu")
    EU(ForeignCode.EU),

    /**
     * belarus\u00e7a
     * 
     */
    @XmlEnumValue("be")
    BE(ForeignCode.BE),

    /**
     * banglade\u015f\u00e7e
     * 
     */
    @XmlEnumValue("bn")
    BN(ForeignCode.BN),

    /**
     * bo\u015fnak\u00e7a
     * 
     */
    @XmlEnumValue("bs")
    BS(ForeignCode.BS),

    /**
     * bretonca
     * 
     */
    @XmlEnumValue("br")
    BR(ForeignCode.BR),

    /**
     * burmaca 
     * 
     */
    @XmlEnumValue("my")
    MY(ForeignCode.MY),

    /**
     * katalanca/valensiyaca
     * 
     */
    @XmlEnumValue("ca")
    CA(ForeignCode.CA),

    /**
     * \u00e7e\u00e7ence
     * 
     */
    @XmlEnumValue("ce")
    CE(ForeignCode.CE),

    /**
     * \u00e7ince
     * 
     */
    @XmlEnumValue("zh")
    ZH(ForeignCode.ZH),

    /**
     * korni\u015fce
     * 
     */
    @XmlEnumValue("kw")
    KW(ForeignCode.KW),

    /**
     * korsikaca
     * 
     */
    @XmlEnumValue("co")
    CO(ForeignCode.CO),

    /**
     * faraoece
     * 
     */
    @XmlEnumValue("fo")
    FO(ForeignCode.FO),

    /**
     * fijice
     * 
     */
    @XmlEnumValue("fj")
    FJ(ForeignCode.FJ),

    /**
     * frizyaca
     * 
     */
    @XmlEnumValue("fy")
    FY(ForeignCode.FY),

    /**
     * g\u00fcrc\u00fcce 
     * 
     */
    @XmlEnumValue("ka")
    KA(ForeignCode.KA),

    /**
     * gaelce/isko\u00e7\u00e7a
     * 
     */
    @XmlEnumValue("gd")
    GD(ForeignCode.GD),

    /**
     * irlandaca
     * 
     */
    @XmlEnumValue("ga")
    GA(ForeignCode.GA),

    /**
     * gali\u00e7yaca 
     * 
     */
    @XmlEnumValue("gl")
    GL(ForeignCode.GL),

    /**
     * mansk\u00e7a 
     * 
     */
    @XmlEnumValue("gv")
    GV(ForeignCode.GV),

    /**
     * gucarat\u00e7a
     * 
     */
    @XmlEnumValue("gu")
    GU(ForeignCode.GU),

    /**
     * haitice/haiti kreyolu
     * 
     */
    @XmlEnumValue("ht")
    HT(ForeignCode.HT),

    /**
     * \u0130branice
     * 
     */
    @XmlEnumValue("he")
    HE(ForeignCode.HE),

    /**
     * hint\u00e7e
     * 
     */
    @XmlEnumValue("hi")
    HI(ForeignCode.HI),

    /**
     * endonezce
     * 
     */
    @XmlEnumValue("id")
    ID(ForeignCode.ID),

    /**
     * javaca
     * 
     */
    @XmlEnumValue("jv")
    JV(ForeignCode.JV),

    /**
     * japonca
     * 
     */
    @XmlEnumValue("ja")
    JA(ForeignCode.JA),

    /**
     * kannada
     * 
     */
    @XmlEnumValue("kn")
    KN(ForeignCode.KN),

    /**
     * kazak\u00e7a
     * 
     */
    @XmlEnumValue("kk")
    KK(ForeignCode.KK),

    /**
     * k\u0131rg\u0131zca
     * 
     */
    @XmlEnumValue("ky")
    KY(ForeignCode.KY),

    /**
     * kongoca
     * 
     */
    @XmlEnumValue("kg")
    KG(ForeignCode.KG),

    /**
     * korece 
     * 
     */
    @XmlEnumValue("ko")
    KO(ForeignCode.KO),

    /**
     * k\u00fcrt\u00e7e
     * 
     */
    @XmlEnumValue("ku")
    KU(ForeignCode.KU),

    /**
     * laoca
     * 
     */
    @XmlEnumValue("lo")
    LO(ForeignCode.LO),

    /**
     * limburgca
     * 
     */
    @XmlEnumValue("li")
    LI(ForeignCode.LI),

    /**
     * lingalaca
     * 
     */
    @XmlEnumValue("ln")
    LN(ForeignCode.LN),

    /**
     * l\u00fcksemburgca
     * 
     */
    @XmlEnumValue("lb")
    LB(ForeignCode.LB),

    /**
     * makedonca
     * 
     */
    @XmlEnumValue("mk")
    MK(ForeignCode.MK),

    /**
     * malayalam
     * 
     */
    @XmlEnumValue("ml")
    ML(ForeignCode.ML),

    /**
     * marathi
     * 
     */
    @XmlEnumValue("mr")
    MR(ForeignCode.MR),

    /**
     * malezyaca
     * 
     */
    @XmlEnumValue("ms")
    MS(ForeignCode.MS),

    /**
     * malagasi
     * 
     */
    @XmlEnumValue("mg")
    MG(ForeignCode.MG),

    /**
     * moldovca
     * 
     */
    @XmlEnumValue("mo")
    MO(ForeignCode.MO),

    /**
     * mogolca
     * 
     */
    @XmlEnumValue("mn")
    MN(ForeignCode.MN),

    /**
     * nepalce 
     * 
     */
    @XmlEnumValue("ne")
    NE(ForeignCode.NE),

    /**
     * norve\u00e7\u00e7e (Norsk)
     * 
     */
    @XmlEnumValue("nn")
    NN(ForeignCode.NN),

    /**
     * norve\u00e7\u00e7e (Bokm\u00e5l)
     * 
     */
    @XmlEnumValue("nb")
    NB(ForeignCode.NB),

    /**
     * pencap\u00e7a
     * 
     */
    @XmlEnumValue("pa")
    PA(ForeignCode.PA),

    /**
     * fars\u00e7a
     * 
     */
    @XmlEnumValue("fa")
    FA(ForeignCode.FA),

    /**
     * pe\u015ftuca
     * 
     */
    @XmlEnumValue("ps")
    PS(ForeignCode.PS),

    /**
     * reto romanca
     * 
     */
    @XmlEnumValue("rm")
    RM(ForeignCode.RM),

    /**
     * \u00e7ingenece
     * 
     */
    @XmlEnumValue("rom")
    ROM(ForeignCode.ROM),

    /**
     * rus\u00e7a
     * 
     */
    @XmlEnumValue("ru")
    RU(ForeignCode.RU),

    /**
     * s\u0131rp\u00e7a
     * 
     */
    @XmlEnumValue("sr")
    SR(ForeignCode.SR),

    /**
     * kuzeylap\u00e7a
     * 
     */
    @XmlEnumValue("se")
    SE(ForeignCode.SE),

    /**
     * sint\u00e7e
     * 
     */
    @XmlEnumValue("sd")
    SD(ForeignCode.SD),

    /**
     * somalice
     * 
     */
    @XmlEnumValue("so")
    SO(ForeignCode.SO),

    /**
     * sarduca
     * 
     */
    @XmlEnumValue("sc")
    SC(ForeignCode.SC),

    /**
     * swahilice
     * 
     */
    @XmlEnumValue("sw")
    SW(ForeignCode.SW),

    /**
     * tahitice
     * 
     */
    @XmlEnumValue("ty")
    TY(ForeignCode.TY),

    /**
     * tamilce
     * 
     */
    @XmlEnumValue("ta")
    TA(ForeignCode.TA),

    /**
     * tatarca
     * 
     */
    @XmlEnumValue("tt")
    TT(ForeignCode.TT),

    /**
     * teluguca
     * 
     */
    @XmlEnumValue("te")
    TE(ForeignCode.TE),

    /**
     * tacik\u00e7e
     * 
     */
    @XmlEnumValue("tg")
    TG(ForeignCode.TG),

    /**
     * tagalogca
     * 
     */
    @XmlEnumValue("tl")
    TL(ForeignCode.TL),

    /**
     * tayca
     * 
     */
    @XmlEnumValue("th")
    TH(ForeignCode.TH),

    /**
     * tibet\u00e7e
     * 
     */
    @XmlEnumValue("bo")
    BO(ForeignCode.BO),

    /**
     * t\u00fcrkmence
     * 
     */
    @XmlEnumValue("tk")
    TK(ForeignCode.TK),

    /**
     * ukraynaca
     * 
     */
    @XmlEnumValue("uk")
    UK(ForeignCode.UK),

    /**
     * urduca
     * 
     */
    @XmlEnumValue("ur")
    UR(ForeignCode.UR),

    /**
     * \u00f6zbek\u00e7e
     * 
     */
    @XmlEnumValue("uz")
    UZ(ForeignCode.UZ),

    /**
     * vietnamca
     * 
     */
    @XmlEnumValue("vi")
    VI(ForeignCode.VI),

    /**
     * galce
     * 
     */
    @XmlEnumValue("cy")
    CY(ForeignCode.CY),

    /**
     * yidce
     * 
     */
    @XmlEnumValue("yi")
    YI(ForeignCode.YI),

    /**
     * yoruba
     * 
     */
    @XmlEnumValue("yo")
    YO(ForeignCode.YO),

    /**
     * Khmerce
     * 
     */
    @XmlEnumValue("km")
    KM(ForeignCode.KM),

    /**
     * langue des signes autrichienne
     * 
     */
    @XmlEnumValue("asq")
    ASQ(ForeignCode.ASQ),

    /**
     * langue des signes albanaise
     * 
     */
    @XmlEnumValue("sqk")
    SQK(ForeignCode.SQK),

    /**
     * langue des signes bosniaque
     * 
     */
    @XmlEnumValue("bos-sgn")
    BOS_SGN(ForeignCode.BOS_SGN),

    /**
     * langue des signes britannique
     * 
     */
    @XmlEnumValue("bfi")
    BFI(ForeignCode.BFI),

    /**
     * langue des signes bulgare
     * 
     */
    @XmlEnumValue("bqn")
    BQN(ForeignCode.BQN),

    /**
     * langue des signes catalane
     * 
     */
    @XmlEnumValue("csc")
    CSC(ForeignCode.CSC),

    /**
     * Hrvatski znakovni jezik
     * 
     */
    @XmlEnumValue("csq")
    CSQ(ForeignCode.CSQ),

    /**
     * langue des signes chypriote
     * 
     */
    @XmlEnumValue("cy-sgn")
    CY_SGN(ForeignCode.CY_SGN),

    /**
     * langue des signes tch\u00e8que
     * 
     */
    @XmlEnumValue("cse")
    CSE(ForeignCode.CSE),

    /**
     * langue des signes danoise
     * 
     */
    @XmlEnumValue("dsl")
    DSL(ForeignCode.DSL),

    /**
     * Nederlandse Gebarentaal
     * 
     */
    @XmlEnumValue("dse")
    DSE(ForeignCode.DSE),

    /**
     * langue des signes estonienne
     * 
     */
    @XmlEnumValue("eso")
    ESO(ForeignCode.ESO),

    /**
     * suomalainen viittomakieli
     * 
     */
    @XmlEnumValue("fse")
    FSE(ForeignCode.FSE),

    /**
     * langue des signes flamande
     * 
     */
    @XmlEnumValue("vgt")
    VGT(ForeignCode.VGT),

    /**
     * langue des signes belge francophone
     * 
     */
    @XmlEnumValue("sfb")
    SFB(ForeignCode.SFB),

    /**
     * langue des signes fran\u00e7aise
     * 
     */
    @XmlEnumValue("fsl")
    FSL(ForeignCode.FSL),

    /**
     * langue des signes allemande
     * 
     */
    @XmlEnumValue("gsg")
    GSG(ForeignCode.GSG),

    /**
     * langue des signes grecque
     * 
     */
    @XmlEnumValue("gss")
    GSS(ForeignCode.GSS),

    /**
     * Magyar jelnyelv, Magyarorsz\u00e1gi jelnyelv
     * 
     */
    @XmlEnumValue("hsh")
    HSH(ForeignCode.HSH),

    /**
     * \u00cdslenskt T\u00e1knm\u00e1l
     * 
     */
    @XmlEnumValue("icl")
    ICL(ForeignCode.ICL),

    /**
     * langue des signes irlandaise
     * 
     */
    @XmlEnumValue("isg")
    ISG(ForeignCode.ISG),

    /**
     * lingua italiana dei segni
     * 
     */
    @XmlEnumValue("ise")
    ISE(ForeignCode.ISE),

    /**
     * langue des signes kosovare
     * 
     */
    @XmlEnumValue("xk-sgn")
    XK_SGN(ForeignCode.XK_SGN),

    /**
     * latvie\u0161u z\u012bmju valoda
     * 
     */
    @XmlEnumValue("lsl")
    LSL(ForeignCode.LSL),

    /**
     * lietuvi\u0173 gest\u0173 kalba
     * 
     */
    @XmlEnumValue("lls")
    LLS(ForeignCode.LLS),

    /**
     * ���������� �������� �����
     * 
     */
    @XmlEnumValue("mk-sgn")
    MK_SGN(ForeignCode.MK_SGN),

    /**
     * Lingwa tas-Sinjali Maltija
     * 
     */
    @XmlEnumValue("mdl")
    MDL(ForeignCode.MDL),

    /**
     * langue des signes mont\u00e9n\u00e9grine
     * 
     */
    @XmlEnumValue("me-sgn")
    ME_SGN(ForeignCode.ME_SGN),

    /**
     * Norsk Tegnspr\u00e5k
     * 
     */
    @XmlEnumValue("nsl")
    NSL(ForeignCode.NSL),

    /**
     * polski j\u0119zyk migowy
     * 
     */
    @XmlEnumValue("pso")
    PSO(ForeignCode.PSO),

    /**
     * l\u00edngua gestual portuguesa
     * 
     */
    @XmlEnumValue("psr")
    PSR(ForeignCode.PSR),

    /**
     * limbajul semnelor rom\u00e2n\u0103
     * 
     */
    @XmlEnumValue("rms")
    RMS(ForeignCode.RMS),

    /**
     * langue des signes serbe
     * 
     */
    @XmlEnumValue("srp-sgn")
    SRP_SGN(ForeignCode.SRP_SGN),

    /**
     * Slovn\u00edk Posunkovej Rec
     * 
     */
    @XmlEnumValue("svk")
    SVK(ForeignCode.SVK),

    /**
     * Slovenski znakovni jezik
     * 
     */
    @XmlEnumValue("slv-sgn")
    SLV_SGN(ForeignCode.SLV_SGN),

    /**
     * lengua de signos espa\u00f1ola
     * 
     */
    @XmlEnumValue("ssp")
    SSP(ForeignCode.SSP),

    /**
     * STS, Svenskt teckenspr\u00e5k,
     * 
     */
    @XmlEnumValue("swl-sgn")
    SWL_SGN(ForeignCode.SWL_SGN),

    /**
     * langue des Signes Suisse romande
     * 
     */
    @XmlEnumValue("ssr")
    SSR(ForeignCode.SSR),

    /**
     * langue des signes suisse allemanique
     * 
     */
    @XmlEnumValue("sgg")
    SGG(ForeignCode.SGG),

    /**
     * langue des signes suisse italienne
     * 
     */
    @XmlEnumValue("slf")
    SLF(ForeignCode.SLF),

    /**
     * t\u00fcrk i\u015faret dili
     * 
     */
    @XmlEnumValue("tsm")
    TSM(ForeignCode.TSM);
    private final ForeignCode value;

    MotherCode(ForeignCode v) {
        value = v;
    }

    public ForeignCode value() {
        return value;
    }

    public static MotherCode fromValue(ForeignCode v) {
        for (MotherCode c: MotherCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
