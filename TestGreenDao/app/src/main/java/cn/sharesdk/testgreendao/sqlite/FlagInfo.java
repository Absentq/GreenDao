package cn.sharesdk.testgreendao.sqlite;

import android.support.annotation.NonNull;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2018\5\9 0009.
 */
@Entity
public class FlagInfo implements List<FlagInfo> {
    @Id(autoincrement = true)
    private long _id;
    private String uid;
    private String name;
    private String number;
    @Generated(hash = 92547180)
    public FlagInfo(long _id, String uid, String name, String number) {
        this._id = _id;
        this.uid = uid;
        this.name = name;
        this.number = number;
    }
    @Generated(hash = 795725049)
    public FlagInfo() {
    }
    public long get_id() {
        return this._id;
    }
    public void set_id(long _id) {
        this._id = _id;
    }
    public String getUid() {
        return this.uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NonNull
    @Override
    public Iterator<FlagInfo> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(@NonNull T[] a) {
        return null;
    }

    @Override
    public boolean add(FlagInfo flagInfo) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends FlagInfo> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NonNull Collection<? extends FlagInfo> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public FlagInfo get(int index) {
        return null;
    }

    @Override
    public FlagInfo set(int index, FlagInfo element) {
        return null;
    }

    @Override
    public void add(int index, FlagInfo element) {

    }

    @Override
    public FlagInfo remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @NonNull
    @Override
    public ListIterator<FlagInfo> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<FlagInfo> listIterator(int index) {
        return null;
    }

    @NonNull
    @Override
    public List<FlagInfo> subList(int fromIndex, int toIndex) {
        return null;
    }
}
