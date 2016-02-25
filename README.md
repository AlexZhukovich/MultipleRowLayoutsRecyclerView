# MultipleRowLayoutsRecyclerView
This short example shows how to use different row layouts for RecyclerView

<img src="https://github.com/AlexZhukovich/MultipleRowLayoutsRecyclerView/blob/master/screen/logo.png" width="720px" height="450px" />

If you want to use different types of row layouts you must to implement next method in adapter:
```java
@Override
public int getItemViewType(int position) {
    ...
}
```

Article: http://alexzh.com/tutorials/multiple-row-layouts-using-recyclerview/
