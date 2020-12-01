class Primitive {
    public static boolean toPrimitive(Boolean b) {
//        if (b == null){
//            return false;
//        }else {
//            return b.booleanValue();
//        }

        boolean result = (b == null) ? false : b.booleanValue();
        return result;
    }
}