Exercise (#2) of users polling a server for web pages using synchronized methods.
Three user threads send requests for random websites to a server, which keeps a count for how many of each site has been requested.

synchronized block within server class has been reduced, and part of it's code moved to the user class.

Map within the server class is now of type <String, Counter>. Counter class added.