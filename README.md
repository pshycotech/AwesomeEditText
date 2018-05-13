# AwesomeEditText

[![](https://jitpack.io/v/pshycotech/AwesomeEditText.svg)](https://jitpack.io/#pshycotech/AwesomeEditText)

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.pshycotech:AwesomeEditText:v1.1'
	}

Add it in your XML Layout : 

    <com.pshycotech.awesomeedittext.AwesomeEditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:text="Hello World!"
        app:errorText="Demo Error"
        app:hintText="Demo hint" />

Methods :


| Methods       | Usage         |
| ------------- | ------------- |
| setErrorEnabled(boolean)  | To Enable/Disable Error  |
| isErrorEnabled()  | To Get Enable/Disable Error  |
| setError(String) | To Set Error |
| getError() | To Get Error |
| setHint(String) | To Set Hint |
| getHintText() | To Get Hint |
| setText(String) | To Set Text |
| getText() | To Get Text |
