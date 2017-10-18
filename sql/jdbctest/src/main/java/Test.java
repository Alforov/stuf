import oracle.jdbc.OracleTypes;

import java.math.BigDecimal;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by mikhail_alferov on 30.06.2017.
 */
public class Test {
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@kerberos:1521:DEV";
    static final String ABS_URL = "jdbc:oracle:thin:@typhoon:1521:work";

    //  Database credentials
    static final String USER = "CREATOR";
    static final String PASS = "c67";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;

        //STEP 2: Register JDBC driver
        Class.forName(JDBC_DRIVER);

        //STEP 3: Open a connection
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(ABS_URL, USER, PASS);
        //conn.setAutoCommit(false);
        eprLoginSecond(conn);
        checkGate(conn);
    }

    private static void eprLoginSecond(Connection conn) throws SQLException {
        CallableStatement callableStatement = conn.prepareCall("{CALL eprlogin_second()}");
        callableStatement.execute();


    }
/*       inParam("in_datebegin", OracleTypes.DATE),
            inParam("in_dateend", OracleTypes.DATE),
            inParam("in_accountno", OracleTypes.VARCHAR),
            inParam("in_siteid", OracleTypes.NUMBER),
            inParam("in_currencyid", OracleTypes.NUMBER),
            inParam("in_DateSeparation", OracleTypes.VARCHAR),
            inParam("in_BookedDateSort", OracleTypes.VARCHAR),
            inParam("in_SummaDestSort", OracleTypes.VARCHAR),
            inParam("in_DateOrder", OracleTypes.VARCHAR),
            inParam("in_StatementPerType", OracleTypes.VARCHAR),
            inParam("in_SortAlfabet", OracleTypes.VARCHAR)*/

    public static void checkGate(Connection conn) throws SQLException, ParseException {
        CallableStatement cs = conn.prepareCall("{CALL PKG_IFOBSGATE.ReportAccountInfoForJasper(?,?,?,?,?,?,?,?,?,?,?,?)}");
        cs.setTimestamp("in_datebegin",new Timestamp(new SimpleDateFormat("yyyy-MM-dd").parse("2010-01-01").getTime()));
        cs.setTimestamp("in_dateend", new Timestamp(new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01").getTime()));
       cs.setString("in_accountno", "10010001000066");
        //cs.setString("in_accountno", "26251000000490");
        cs.setBigDecimal("in_siteid", new BigDecimal(300003));
        cs.setBigDecimal("in_currencyid",  new BigDecimal(980));
        cs.setString("in_DateSeparation", null);
        cs.setString("in_BookedDateSort", null);
        cs.setString("in_SummaDestSort", null);
        cs.setString("in_DateOrder", null);
        cs.setString("in_StatementPerType", null);
        cs.setString("in_SortAlfabet", null);
        cs.registerOutParameter("out_res", OracleTypes.CURSOR);
        // cs.registerOutParameter(10, OracleTypes.CURSOR);
        cs.execute();
        ResultSet resultSet = (ResultSet) cs.getObject("out_res");
        while (resultSet.next()) {
            Object object = resultSet.getObject(1);
            System.out.println(object);
        }
/*  in_datebegin        DATE,
    in_dateend          DATE,
    in_accountid        VARCHAR2,
    in_DateSeparation   VARCHAR2,
    in_BookedDateSort   VARCHAR2,
    in_SummaDestSort    VARCHAR2,
    in_DateOrder        VARCHAR2,
    in_StatementPerType VARCHAR2,
    in_SortAlfabet      VARCHAR2,*/

    }


    public static BigDecimal changeClientInfo(Connection conn, ChangeClientInfo request,
                                              BigDecimal clientId, BigDecimal contragentId, String tobo) throws SQLException {
      /*  LiveAddress liveAddress = request.getLiveAddress();*/
      /*  JurAddress jurAddress = request.getJurAddress();*/
        CallableStatement csmst = null;
        BigDecimal result;
        try {
            csmst = conn
                    .prepareCall("{CALL ?:= PKI_E4_B2.SaveContragentEx(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            csmst.registerOutParameter(1, OracleTypes.NUMBER);


            csmst.registerOutParameter(2, OracleTypes.NUMBER);
            csmst.setObject(2, new BigDecimal(33)); // in_bpid

            csmst.registerOutParameter(3, OracleTypes.NUMBER);
            csmst.setObject(3, new BigDecimal(54)); // in_contragentid


            csmst.registerOutParameter(4, OracleTypes.CURSOR); // out_client


            csmst.setObject(5, null); // in_username
            csmst.setObject(6, null); // in_siteid
            csmst.setObject(7, null); // in_lastname
            csmst.setObject(8, null); // in_firstname
            csmst.setObject(9, null); // in_secondname
            csmst.setObject(10, null); // in_passportSerial
            csmst.setObject(11, null); // in_passportDay
            csmst.setObject(12, null); // in_passporttype
            csmst.setObject(13, null); // in_issuePlace
            csmst.setObject(14, null); // in_birthDay
            csmst.setObject(15, null); // in_nationality
            csmst.setObject(16, null); // in_idCodeNumber
            csmst.setObject(17, null);
            csmst.setObject(18, null); // in_idCodeAdmin
            csmst.setObject(19, null); // in_idCodeRegDay
            csmst.setObject(20, null); // in_docTypeCodeReg
            csmst.setObject(21, null); // in_country
            csmst.setObject(22, null); // in_liveIndex
            csmst.setObject(23, null); // in_liveRegion
            csmst.setObject(24, null); // in_liveArea
            csmst.setObject(25, null); // in_liveCity
            csmst.setObject(26, null); // in_liveStreet
            csmst.setObject(27, null); // in_liveHouse
            csmst.setObject(28, null); // in_liveFlat

            csmst.setObject(29, null); // in_phone
            csmst.setObject(30, null); // in_fax
            csmst.setObject(31, null); // in_email
            csmst.setObject(32, null); // in_sex
            csmst.setObject(33, null); // in_birthplace
            csmst.setObject(34, null); // in_ClientNameLat
            csmst.setObject(35, null); // in_NOTE
            csmst.setObject(36, null);
            csmst.setObject(37, null);
            csmst.setObject(38, null);
            csmst.setObject(39, null);
            csmst.setObject(40, null);
            csmst.setObject(41, null); // in_IsBp
            csmst.setObject(42, null);
            csmst.setObject(43, null); // in_isInvestor
            csmst.setObject(44, null); // in_smallbusinessid
            csmst.setObject(45, null); // in_institutesectorid
            csmst.setObject(46, null); // in_jurAddrArea
            csmst.setObject(47, null); // in_jurAddrCountryId
            csmst.setObject(48, null); // in_jurAddrCity
            csmst.setObject(49, null); // in_jurAddrFlat
            csmst.setObject(50, null); // in_jurAddrHouseNo
            csmst.setObject(51, null); // in_jurAddrIndex
            csmst.setObject(52, null); // in_jurAddrRegion
            csmst.setObject(53, null); // in_jurAddrStreet

            csmst.setObject(54, null); // in_mobilephone
            csmst.setObject(55, null); // in_businesstype1
            csmst.setObject(56, null); // in_jurAddress


            csmst.setObject(57, null); // in_Address
            csmst.setObject(58, null); // in_isfulladdressmod
            csmst.setObject(59, null); // in_cratingnbuid
            csmst.setObject(60, null); // in_insiderid

            csmst.setObject(61, null); // in_citizenshipcountryid
            csmst.setObject(62, null); // in_familystatusid
            csmst.setObject(63, null); // in_educationid
            csmst.setObject(64, null); // in_professionid
            csmst.setObject(65, null); // in_workplace
            csmst.setObject(66, null); // in_workdate
            csmst.setObject(67, null); // in_passport_serial
            csmst.setObject(68, null); // in_passport_no
            csmst.setObject(69, null); // in_lastname_lat
            csmst.setObject(70, null); // in_firstname_lat
            csmst.setObject(71, null); // in_secondname_lat
            csmst.setObject(72, tobo); // in_tobo
            csmst.setObject(73, null); // in_deathdate
            csmst.setObject(74, null); // in_ismanager
            csmst.setObject(75, null); // in_lastsurname
            csmst.setObject(76, null); // in_namealt
            csmst.setObject(77, null); // in_patronymicnamealt
            csmst.setObject(78, null); // in_lastnamealt
            csmst.setObject(79, null); // in_isprivateentrepreneur
            csmst.setObject(80, null); // in_iscardcodeword
            csmst.setObject(81, null); // in_acquisitionid
            csmst.setObject(82, null); // in_servicemode
            csmst.setObject(83, null); // in_vipclient
            csmst.setObject(84, null); // in_forcemode

            csmst.setObject(85, null); // in_Addr_cityID
            csmst.setObject(86, null); // in_Addr_StreetID

            csmst.setObject(87, null); // in_JurAddr_cityID
            csmst.setObject(88, null); // in_JurAddr_StreetID

            csmst.setObject(89, null); // in_passportphotoexists
            csmst.setObject(90, null); // in_passportenddate
            csmst.execute();
            result = (BigDecimal) csmst.getObject(1);
        } finally {

        }
        return result;
    }
}

