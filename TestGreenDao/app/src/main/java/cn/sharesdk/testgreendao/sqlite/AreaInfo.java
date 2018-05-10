package cn.sharesdk.testgreendao.sqlite;

import android.support.annotation.NonNull;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2018\5\9 0009.
 *
 *  区域表
 */
@Entity
public class AreaInfo implements List<AreaInfo> {
    private String area_label;//区域编号
    private String area_name;//区域名称
    @Generated(hash = 58122891)
    public AreaInfo(String area_label, String area_name) {
        this.area_label = area_label;
        this.area_name = area_name;
    }
    @Generated(hash = 177146206)
    public AreaInfo() {
    }
    public String getArea_label() {
        return this.area_label;
    }
    public void setArea_label(String area_label) {
        this.area_label = area_label;
    }
    public String getArea_name() {
        return this.area_name;
    }
    public void setArea_name(String area_name) {
        this.area_name = area_name;
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
    public Iterator<AreaInfo> iterator() {
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
    public boolean add(AreaInfo areaInfo) {
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
    public boolean addAll(@NonNull Collection<? extends AreaInfo> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NonNull Collection<? extends AreaInfo> c) {
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
    public AreaInfo get(int index) {
        return null;
    }

    @Override
    public AreaInfo set(int index, AreaInfo element) {
        return null;
    }

    @Override
    public void add(int index, AreaInfo element) {

    }

    @Override
    public AreaInfo remove(int index) {
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
    public ListIterator<AreaInfo> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<AreaInfo> listIterator(int index) {
        return null;
    }

    @NonNull
    @Override
    public List<AreaInfo> subList(int fromIndex, int toIndex) {
        return null;
    }
}
