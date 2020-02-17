# Kestros User Foundation
Foundational Classes for adapting JCR Users and Groups to Sling Models, and Services for retrieving Users and Groups.

## KestrosUser
Adapted from a JCR User Resource. Provides id, admin status and group membership. For additional methods, the `KestrosUser` should be adapted to an extending Model.
 
## KestrosUserGroup
Adapted from a JCR Group Resource. Provides id, group membership, users and groups that are members. For additional methods, the `KestrosUserGroup` should be adapted to an extending Model.

## KestrosUserService
Retrieves `KestrosUser` and `KestrosUserGroups`. Can be specific to a user/group id, or current user.

To use from a Sling Model
```
@OSGiService
private KestrosUserService userService;
```

To user from an OSGI Service
```
@Reference
private KestrosUserService userService;
```