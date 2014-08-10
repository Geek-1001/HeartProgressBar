#HeartProgressBar 

<img src="https://www.dropbox.com/s/gtovjzhco3d0uzi/heartProgressBar.gif?dl=1" height="50%" width="50%" />

I've wrote this progress bar for my girlfriend. It's sound strange, I know it :)
But feel free to use it in your Android apps. 
*HeratProgressBar* - just progress bar looks like heart with nice animation.

##Demo

It's demo app with [HeartProgressBar](https://www.dropbox.com/s/1287va7jiqs3kgh/app-debug.apk).


##How to Use it

Just follow all steps below and enjoy this custom view.

###Step 1:

Copy **HeartProgressBar.java** in your project.

###Step 2:

Add **HeartProgressBar** in your XML layour like in example below

	<HeartProgressBar
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
		android:id="@+id/progressBar"/>
		
		
`Note: width and height of HeartProgressBar should be equals.`

###Step 3:

Find HeartProgressBar in your layout and start/dismiss it.

	HeartProgressBar progressBar = (HeartProgressBar) findViewById(R.id.progressBar);
	
	progressBar.start();
	
	progressBar.dismiss();
	
	
##In future...

I'll make this .jar library.

Add animation drawing proccess to separate thread for better performance.	