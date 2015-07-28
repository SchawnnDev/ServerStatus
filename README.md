ServerStatus
============
----------

Description:
------------

ServerStatus is an api which servers to get server informations (motd, players...) with a simple ip address.


----------

API:
--------

Create a new instance

    ServerStatus serverStatus = new ServerStatus(ip_address);

Get the data

    serverStatus.getServerStatus(statustype);

StatusType is a enum, you can see it [here](https://github.com/SchawnnDev/ServerStatus/blob/master/src/main/java/fr/schawnndev/StatusType.java#L10).


----------

Example:
--------

An example is available in the source code, you can see it [here](https://github.com/SchawnnDev/ServerStatus/blob/master/src/test/java/fr/schawnndev/Example.java#L15).


----------

Plugin by [SchawnnDev](https://twitter.com/SchawnnDev).
