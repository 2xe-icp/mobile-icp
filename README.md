# mobile-icp
Mobile client for Independent Conference Project

# Project Structure

3 Modules
- core: contains the shared Kotlin code
- androidapp: contains the native Android app code
- iosapp: contains the native iOS app code

# Deployment

- `cd` into the `mbile-icp` directory and run `./gradlew clean build`

This needs to be done at least once before you can build the iOS project.

This ensures the `packForXCode` tasks is run to generate the iOS framework needed to build the iOS project with the shared Kotlin module

## Android

- run `./gradlew androidapp:assemble` to build the Android app artifacts


## iOS

- Open the iOS project in XCode
- Build & Run the project to deploy to the simulator
