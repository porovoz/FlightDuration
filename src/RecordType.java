public enum RecordType {
    FLIGHTDURATION {
        @Override
        public Record createRecord() {
            return new FlightDuration();
        }
    };

    public abstract Record createRecord();
}
