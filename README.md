# Welcome to N.E.O. Viewer!
<<NEO viewer uses the NeoWs API from the [NASA JPL Asteroid Team](https://api.nasa.gov/neo/?api_key=DEMO_KEY#!/rest%2Fv1%2Fneo/browseNearEarthObjects)>>  
  
NEO viewer runs a menu driven application which creates a NeoDatabase instance and then prompts the user for a menu command selecting the operation. Using a library that implements JSON encoders/decoders in Java, data requested from the API can be stored in a ArrayList where we can display information in a formatted chart. Users are also able to sort by name, distance, id, and diameter.  

Here is what the formatted display looks like:  
![alt text](https://github.com/SYeshi/NeoWsJava/blob/main/Menu.png "Formatted Table")
