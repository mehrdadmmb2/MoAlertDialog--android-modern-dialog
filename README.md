# How to use?

1- Initialize MoAlertDialog:
<pre> MoAlertDialog dialog = new MoAlertDialog(context);</pre>

2- Show default Error or Success dialog:
<pre>
dialog.showErrorDialog("Title", "Body");
</pre>

![alt text](http://s8.picofile.com/file/8350731926/Screenshot_20190131_143704_MoAlertDialog.jpg)

<pre>
dialog.showSuccessDialog("Title","Body");
</pre>

![alt text](http://s8.picofile.com/file/8350731976/Screenshot_20190131_143834_MoAlertDialog.jpg)

3- You can change all dialog's options:
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
