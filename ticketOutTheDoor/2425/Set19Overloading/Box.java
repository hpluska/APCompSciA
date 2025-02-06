class Box {

    double width, height, depth;

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {

        width = w;
        height = h;
        depth = d;

    }

    // constructor used for a cube
    Box(double len) {

        width = height = depth = len;
    }

    // constructor used when no dimensions are specified
    Box() {

        width = height = depth = 0;
    }

    // compute and return volume
    double getVolume() {

        return width * height * depth;

    }

}