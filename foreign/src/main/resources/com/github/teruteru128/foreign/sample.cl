__kernel void func(global char* a, global char* b) {
    size_t x = get_global_id(0);
    size_t sizeX = get_global_size(0);
    size_t y = get_global_id(1);
    size_t sizeY = get_global_size(1);
    size_t z = get_global_id(2);
    size_t sizeZ = get_global_size(2);
    a[((z * sizeY) + y) * sizeX + x] = b[((z * sizeY) + y) * sizeX + x] << 2;
}
