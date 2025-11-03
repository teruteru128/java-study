__kernel void func(global char* a, global char* b) {
    size_t x = get_global_id(0);
    size_t sizeX = get_global_size(0);
    size_t y = get_global_id(1);
    size_t sizeY = get_global_size(1);
    size_t z = get_global_id(2);
    size_t sizeZ = get_global_size(2);
    size_t index = ((z * sizeY) + y) * sizeX + x;
    a[index] = (b[index] << 1) + b[index] + 1;
}
