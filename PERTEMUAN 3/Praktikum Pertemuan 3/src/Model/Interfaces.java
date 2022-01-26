package Model;

import Entity.SiswaEntity;
public interface Interfaces {
    public void view();
    public void insert(Object x);
    public void update(int index, SiswaEntity x);
    public void delete(int index);
}
