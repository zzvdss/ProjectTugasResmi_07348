package Model;

import Controller.KoneksiDb;

import java.sql.Connection;

public class SepatuModelAbstract {
    Connection conn = KoneksiDb.getconnection();
public abstract void updatemerek(String merek, String id);
}
