# android-activity-life-cycle
This demonstrate the activity life cycle in Android.

The following diagram shows the important state paths of an Activity.<br>
Screenshot1<br>
[![activyt-life-cycle.jpg](https://s19.postimg.org/dkaug8rgz/activyt_life_cycle.jpg)](https://postimg.org/image/76lrczmkv/)

Screenshot2<br>
[![android-activity-life-cycle2.png](https://s19.postimg.org/ld63lymtv/android_activity_life_cycle2.png)](https://postimg.org/image/64g686t5b/)

# Introduction:-
As a user navigates through, out of, and back to your app, the Activity instances in your app transition between different states in their lifecycle.The activity has a sequence of callbacks methods which get called when the activity get launched. The first method is onCreate(). This method get called as soon the activity is first created. Generally the onCreate() method is to loads all the UI component using the XML file available in res/layout folder of the project.

<b>An activity can be in one of the following 4 states at any point of time:-</b></br>
Running - Activity is visible and interacting with the user.(at the top of the stack)</br>
Paused - Activity is still visible, but no longer interacting with the user. A paused activity is completely alive (it maintains all state and member information and remains attached to the window manager), but can be killed by the system in extreme low memory situations.</br>
Stopped - Activity is no longer visible</br>
Killed - Activity has been killed by the system (low memory) or its finish() method has been called.

<b>Activity callback and description:-</b><br>
<b>1. onCreate()</b> - This is the first callback when the activity is created. This method is used for initialize the UI components. or you can say onCreate() is where you initialize your activity usually setContentView() method. This method is also used to retrieve the widgets which is there in the UI using findViewById(int)method. Here you do all of your normal static set up: create views, bind data to lists, etc<br>
<b>2. onStart()</b> - This method called when the activity is visible to user but not ready for interaction. This method used to register a BroadcastReceiver. <br>
<b>3. onResume()</b> - This method called when the activity is in foreground i.e. the activity is visible to user and the user starts interacting with the application. This used to initialize fields, register listeners, bind to services etc.<br>
<b>4. onPause</b> - This method called when the activity is about to go to background and the user has stopped interacting. This happens when the another activity comes over to the current activity. i.e another activity gets into the foreground. This is typically used to commit unsaved changes to persistent data, stop animations and other things that may be consuming CPU, etc.<br>
<b>5. onStop</b> - Called when the activity is no longer visible to the user. Time or CPU intensive shut-down operations, such as writing information to a database should be down in the onStop() method. This method used to unregister a BroadcastReceiver.<br>
<b>6. onDestroy()</b> - This callback is called before the activity is destroyed by the system or finish() called was called on the activity or the system needed to free up some memory.<br> 

# Links:-
Here are some useful links for more details.

1. https://developer.android.com/reference/android/app/Activity.html
2. https://developer.android.com/training/basics/activity-lifecycle/index.html
3. https://www.tutorialspoint.com/android/android_acitivities.htm
4. http://www.vogella.com/tutorials/AndroidLifeCycle/article.html
5. https://guides.codepath.com/android/Activity-Lifecycle
6. http://www.eazytutz.com/android/android-activity-lifecycle/

<b>Points</b>
* Starting with Honeycomb, an application is not in the killable state until its onStop() has returned.
