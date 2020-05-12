package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.zakharov.android.lab3.DataBinderMapperImpl());
  }
}
