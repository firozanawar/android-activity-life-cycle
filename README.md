# android-activity-life-cycle
This demonstrate the activity life cycle in Android.


[![activyt-life-cycle.jpg](https://s19.postimg.org/dkaug8rgz/activyt_life_cycle.jpg)](https://postimg.org/image/76lrczmkv/)

# Introduction:-
As a user navigates through, out of, and back to your app, the Activity instances in your app transition between different states in their lifecycle.The activity has a sequence of callbacks methods which get called when the activity get launched. The first method is onCreate(). This method get called as soon the activity is first created. Generally the onCreate() method is to loads all the UI component using the XML file available in res/layout folder of the project.

<b>An activity can be in one of the following 4 states at any point of time:-</b></br>
Running - Activity is visible and interacting with the user</br>
Paused - Activity is still visible, but no longer interacting with the user</br>
Stopped - Activity is no longer visible</br>
Killed - Activity has been killed by the system (low memory) or its finish() method has been called.

<b>Activity callback and description:-</b><br>
<b>1. onCreate()</b> - This is the first callback when the activity is created. This method is used for initialize the UI components.<br>
<b>2. onStart()</b> - This method called when the activity is visible to user but not ready for interaction.<br>
<b>3. onResume()</b> - This method called when the activity is in foreground i.e. the activity is visible to user and the user starts interacting with the application. This used to initialize fields, register listeners, bind to services etc.<br>
<b>4. onPause</b> - This method called when the activity is about to go to background and the user has stopped interacting. This happens when the another activity comes over to the current activity. i.e another activity gets into the foreground.<br>
<b>5. onStop</b> - Called when the activity is no longer visible to the user. Time or CPU intensive shut-down operations, such as writing information to a database should be down in the onStop() method.<br>
<b>6. onDestroy()</b> - This callback is called before the activity is destroyed by the system or finish() called was called on the activity or the system needed to free up some memory.<br> 

# Links:-
Here are some useful links for more details.

1. https://developer.android.com/reference/android/app/Activity.html
2. https://developer.android.com/training/basics/activity-lifecycle/index.html
3. https://www.tutorialspoint.com/android/android_acitivities.htm
4. http://www.vogella.com/tutorials/AndroidLifeCycle/article.html
5. https://guides.codepath.com/android/Activity-Lifecycle
6. http://www.eazytutz.com/android/android-activity-lifecycle/
