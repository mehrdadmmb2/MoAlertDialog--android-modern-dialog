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
	        implementation 'com.github.mehrdadmmb2:MoAlertDialog:1.0.1'
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

3-  After use the show methos you can change all dialog's options:
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
dialog.dismis()
</pre>
Also you can set clickHandler on dialog's button;
<pre>dialog.setOnButtonClickListener(View.OnClickListener listener)</pre>
