class PsFive {
    static String model;
    static String cpu;
    static String gpu;
    static String teraflops;
    static String memory;
    static String memoryBandwidth;
    static String storage;
    static String ioThroughput;
    static String discDrive;
    static String audioEngine;

    public static boolean createPsFive(String modelName, String cpuType, String gpuType, String tflops,
                                      String mem, String memBandwidth, String storageSize, String ioSpeed,
                                      String driveType, String audioType) {
        boolean isPsFiveCreated = false;

        boolean isModelValid = false;
        boolean isCpuValid = false;
        boolean isGpuValid = false;
        boolean isTeraflopsValid = false;
        boolean isMemoryValid = false;
        boolean isMemBandwidthValid = false;
        boolean isStorageValid = false;
        boolean isIoThroughputValid = false;
        boolean isDiscDriveValid = false;
        boolean isAudioEngineValid = false;

        if (modelName != null && !modelName.isEmpty()) {
            model = modelName;
            isModelValid = true;
        } else {
            System.out.println("The model name is not valid");
        }

        if (cpuType != null && !cpuType.isEmpty()) {
            cpu = cpuType;
            isCpuValid = true;
        } else {
            System.out.println("The CPU type is not valid");
        }

        if (gpuType != null && !gpuType.isEmpty()) {
            gpu = gpuType;
            isGpuValid = true;
        } else {
            System.out.println("The GPU type is not valid");
        }

        if (tflops != null && !tflops.isEmpty()) {
            teraflops = tflops;
            isTeraflopsValid = true;
        } else {
            System.out.println("The teraflops value is not valid");
        }

        if (mem != null && !mem.isEmpty()) {
            memory = mem;
            isMemoryValid = true;
        } else {
            System.out.println("The memory is not valid");
        }

        if (memBandwidth != null && !memBandwidth.isEmpty()) {
            memoryBandwidth = memBandwidth;
            isMemBandwidthValid = true;
        } else {
            System.out.println("The memory bandwidth is not valid");
        }

        if (storageSize != null && !storageSize.isEmpty()) {
            storage = storageSize;
            isStorageValid = true;
        } else {
            System.out.println("The storage size is not valid");
        }

        if (ioSpeed != null && !ioSpeed.isEmpty()) {
            ioThroughput = ioSpeed;
            isIoThroughputValid = true;
        } else {
            System.out.println("The IO throughput is not valid");
        }

        if (driveType != null && !driveType.isEmpty()) {
            discDrive = driveType;
            isDiscDriveValid = true;
        } else {
            System.out.println("The disc drive is not valid");
        }

        if (audioType != null && !audioType.isEmpty()) {
            audioEngine = audioType;
            isAudioEngineValid = true;
        } else {
            System.out.println("The audio engine is not valid");
        }

        if (isModelValid && isCpuValid && isGpuValid && isTeraflopsValid && isMemoryValid &&
            isMemBandwidthValid && isStorageValid && isIoThroughputValid && isDiscDriveValid && isAudioEngineValid) {
            isPsFiveCreated = true;
        }
        return isPsFiveCreated;
    }

    public static void getPsFiveDetails() {
      
        System.out.println("Model: " + model);
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
        System.out.println("Teraflops: " + teraflops);
        System.out.println("Memory: " + memory);
        System.out.println("Memory Bandwidth: " + memoryBandwidth);
        System.out.println("Storage: " + storage);
        System.out.println("IO Throughput: " + ioThroughput);
        System.out.println("Disc Drive: " + discDrive);
        System.out.println("Audio Engine: " + audioEngine);
      
    }
}

