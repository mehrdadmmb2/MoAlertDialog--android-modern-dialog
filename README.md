# What is this?
MoAlertDialog is a modern AlertDialog for Android.
You need AppCompat 26.0.0 or later and min SDK 14 To use this library.

# How to install?


Add it in your root build.gradle at the end of repositories:

<pre>
allprojects {
	repositories {
	...
		maven { url 'https://jitpack.io' }
	}
}
</pre>
Add the dependency

<pre>
dependencies {
	implementation 'com.github.mehrdadmmb2:MoAlertDialog:1.1.0'
}
</pre>

# How to use?

1- Initialize MoAlertDialog:
<pre> MoAlertDialog dialog = new MoAlertDialog(context);</pre>

2- Show default Error or Success dialog:
<pre>
dialog.showErrorDialog("Title", "Body");
dialog.showSuccessDialog("Title","Body");
</pre>

<img src="http://s8.picofile.com/file/8350731926/Screenshot_20190131_143704_MoAlertDialog.jpg" width='300px'> <img src="http://s8.picofile.com/file/8350731976/Screenshot_20190131_143834_MoAlertDialog.jpg" width='300px'>

3-  After the use of one of the show methods, you can change all the dialog's options:
<pre>
dialog.setDialogHeaderColor(int color)
dialog.setDialogBackgroundColor(int color)
dialog.setDialogButtonText(String text)
dialog.setDialogButtonBack(int backResource)
dialog.setDialogButtonTextColor(int color)
dialog.setDialogTitleTextColor(int color)
dialog.setDialogContentTextColor(int color)
dialog.setDilogIcon(int icon)
dialog.setDialogCancelable(boolean cancelable)
dialog.setDialogIconAnimation(Animation animation)
dialog.setTypeface(Typeface typeface)
dialog.setContentGravity(int gravity)
dialog.dismis()
</pre>
Also you can set clickHandler on dialog's button;
<pre>dialog.setOnButtonClickListener(View.OnClickListener listener)</pre>

sample HOTSTART{"version":"42","tips":"- اضافه شدن کراپر عکس\n- حل مشکل چرخیدن عکس\n- اضافه شدن امکان ذخیره موقت متن برای خروج ناگهانی از برنامه\n- اضافه شدن امکان اشتراک گذاری PDF ساخته شده از بخش تاریخچه\n","link":0,"hash":"eyJwYXJ0MSI6IjxzZWN0aW9uIGNsYXNzPVwic3BlY2lhbG9mZmVyXCI+KFtcXFNcXHNdKj8pPC9zZWN0aW9uPiIsInBhcnQyIjoiPHVsPihbXFxTXFxzXSo/KTwvdWw+IiwibmFtZXMiOiI8YSBocmVmPVwiLio/XCI+KFtcXFNcXHNdKj8pPC9hPiIsImxpbmtzIjoiaHJlZj1cIi4qP1wiIiwiaW1hZ2VzIjoiL2ltYWdlcy4qLmpwZyIsIm9sZHByaWNlIjoiPHAgY2xhc3M9XCJvbGRwcmljZVwiLio/PihbXFxTXFxzXSo/KTwvcD4iLCJuZXdwcmljZSI6IjxwIGNsYXNzPVwibmV3cHJpY2VcIi4qPz4oW1xcU1xcc10qPyk8L3A+IiwicG9wdWxhciI6IjxkaXYgY2xhc3M9XCJqY2Fyb3VzZWxcIi4qPz4oW1xcU1xcc10qPyk8YSBocmVmPVwiI1wiIiwicG9waW1hZ2VzIjoic3JjPVwiKFtcXFNcXHNdKj8pXCIiLCJwb3BfbmFtZV9saW5rIjoiPGguKj48YSBocmVmPVwiKC4qKVwiPihbXFxTXFxzXSo/KTwvYT48L2guKj4iLCJwb3BwcmljZSI6IjxwIGNsYXNzPVwicHJpY2VcIj4oLiopPC9wPiIsImxhc3Rwcm9kdWN0IjoiPGFydGljbGUgY2xhc3M9XCJwb3N0XCI+KFtcXFNcXHNdKj8pPC9hcnRpY2xlPiIsImxhc3RwX2ltYWdlcyI6InNyYz1cIiguKj8pXCIiLCJsYXN0cF9wcmljZSI6IjxwIGNsYXNzPVwicHJpY2VcIj4oLio/KTwvcD4iLCJsYXN0cF9uYW1lX2xpbmsiOiI8aDM+PGEgaHJlZj1cIiguKj8pXCI+KC4qPyk8L2E+IiwiZGV0X2RlcyI6IjxhcnRpY2xlIGNsYXNzPVwiZnVsbGNvbnRlbnRcIi4qPz4oW1xcU1xcc10qPyk8L2FydGljbGU+IiwiZGV0X3JtX2Rlc2MiOiI8ZGl2IGNsYXNzPVwidGFnc1wiLio/PihbXFxTXFxzXSo/KTwvZGl2PiIsInNsaWRlciI6Ijx1bCBpZD1cImltYWdlLWdhbGxlcnlcIi4qPz4oW1xcU1xcc10qPyk8L3VsPiIsImRldF9pbWFnZTAiOiI8aW1nIHNyYz1cIiguKj8pXCIiLCJkZXRfaW1hZ2UiOiI8aW1nLiouYm9yZGVyPVwiMFwiIC8+IiwiZGV0X2ltYWdlMiI6IjxpbWdbXFxzXFxTXS4qW1xcc1xcU11qcGdcIiAvPiIsImRldF9jb21tZW50cyI6IjxkaXYgY2xhc3M9XCJjb21tZW50TXNnLipcIj4oLiopPC9kaXY+In0="}HOTEND
